package com.og.controller;


import com.og.model.Product;
import com.og.service.productServiceImpl;
import com.og.utils.ValidateUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "productServlert", urlPatterns = "/product")
public class productServlert extends HttpServlet {
    com.og.service.productService productService;

    //    OrderTableService orderTableService;
    @Override
    public void init() throws ServletException {
        productService = new productServiceImpl();
//        orderTableService = new OrderTableServiceImpl();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html/charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");

        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                doProductCreate(req, resp);
                break;
            case "edit":
                doUpdate(req, resp);
                break;
            case "delete":
                doDeleteProduct(req, resp);
                break;
//            case "edit":
//                doProductEdit(req,resp);
            default:
                showCP(req, resp);
                break;
        }
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "list":
                showProductPage(req, resp);
                break;
            case "edit":
                showProductEditPage(req, resp);
                break;
            case "create":
                showProductCreatePage(req, resp);
                break;
            case "delete":
                showProductDelete(req, resp);
                break;
            case "search" :
                dosearchByKey(req, resp);
                break;
            default:
                showCP(req, resp);
                break;
        }
    }

    private void showCP(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("cp/index.jsp");
        List<Product> productList = null;
        String key = "";
        if (req.getParameter("search") != null) {
            key = req.getParameter("search");
            productList = productService.searchByKey(key);
        } else {
            productList = productService.findAll();
        }
        req.setAttribute("productList", productList);
        dispatcher.forward(req, resp);
    }

    public void showProductPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("cp/index.jsp");
        List<Product> productList = productService.findAll();
        req.setAttribute("productList", productList);
        dispatcher.forward(req, resp);
    }

    public void showProductCreatePage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("cp/product/create.jsp");
        dispatcher.forward(req, resp);
    }

    public void doProductCreate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("cp/product/create.jsp");
        Product updateProduct;
        String name = req.getParameter("name");
        Double price = Double.parseDouble(req.getParameter("price"));
        String information = req.getParameter("information");
        LocalDate createdAt = java.time.LocalDate.now();



        updateProduct = new Product(name, price, information,createdAt);
        boolean success = false;
        boolean exist = productService.create(updateProduct);
        System.out.println("ok eoi");
        List<String> error = new ArrayList<>();

        if (price < 0 || price > 1000000000) {
            error.add("Giá không hợp lệ");
        }
        if (name.equals("")) {
            error.add("Tên không được để trống");
        }

        if (error.size() == 0) {
            Product product = new Product(name, price, information,createdAt);
             success = true;
             productService.update(product);
//            if (success) {
                req.setAttribute("success", true);
//            } else {
//                req.setAttribute("errors", true);
//                error.add("Dữ liệu không đúng, vui lòng kiểm tra lại!");
//            }
        }
        if (error.size() > 0) {
            req.setAttribute("errors", error);
            error.add("Dữ liệu không đúng, vui lòng kiểm tra lại!");
        }
        dispatcher.forward(req, resp);
    }

//
//        if (exist) {
//
//        } else if (errors.size() == 0) {
//            Product product = new Product(name, price, information);
//            boolean success = false;
//            success = productService.update(updateProduct);
//            if (success) {
//                req.setAttribute("success", true);
//            } else {
//                req.setAttribute("errors", true);
//                errors.add("Dữ liệu không đúng, vui lòng kiểm tra lại!");
//            }
//        }
//        if (errors.size() > 0) {
//            req.setAttribute("errors", errors);
//            req.setAttribute("product", updateProduct);
//        }
//        dispatcher.forward(req, resp);
////        productService.create(product);
//        dispatcher.forward(req, resp);

    private void showProductEditPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("cp/product/editOut.jsp");
        String id = req.getParameter("id");
        Product product = productService.findById(Integer.parseInt(id));
        if (product != null) {
            req.setAttribute("product", product);
        }
        dispatcher.forward(req, resp);

    }

    private void doUpdate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("cp/product/editOut.jsp");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        Double price = Double.parseDouble(req.getParameter("price"));
        String information = req.getParameter("information");
        LocalDate updatedAt = java.time.LocalDate.now();

        List<String> error = new ArrayList<>();

        if (price < 9000 ) {
            error.add("Giá quá thấp, vui lòng nhập giá vs số giá phải hơn 9k");
        }
        if (price > 1000000000) {
            error.add("Giá cao quá, giảm giá lại đi, nhỏ hơn 1 tỉ ");
        }
        if (price.equals("")) {
            error.add("Vui lòng nhập giá");
        }
        if (name.equals("")) {
            error.add("Tên không được để trống");
        }

        if (error.size() == 0) {
            Product product = new Product(Integer.parseInt(id), name, price, information, updatedAt);
            boolean success = false;
            success = productService.update(product);
            if (success) {
                req.setAttribute("success", true);
            } else {
                req.setAttribute("errors", true);
                error.add("Dữ liệu không đúng, vui lòng kiểm tra lại!");
            }
        }
        if (error.size() > 0) {
            req.setAttribute("errors", error);
        }
        dispatcher.forward(req, resp);
    }
    private void doDeleteProduct(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("cp/index.jsp");
        int id = Integer.parseInt(req.getParameter("id"));
        productService.remove(id);
        List<Product> productList = productService.findAll();
        req.setAttribute("productList", productList);
        dispatcher.forward(req, resp);
    }

    private void showProductDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("cp/product/delete.jsp");
        dispatcher.forward(req, resp);
    }
    public void dosearchByKey(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/cp/index.jsp");
        List<Product> productList = null;
        String key = "";
        if (req.getParameter("search") != null) {
            key = req.getParameter("search");
            productList = productService.searchByKey(key);
        } else {
            productList = productService.findAll();
        }
        req.setAttribute("productList", productList);

        dispatcher.forward(req, resp);
    }
}
