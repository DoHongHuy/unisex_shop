package com.og.controller;


import com.og.dto.OrderTableDTO;
import com.og.model.Product;
import com.og.service.OrderTableService;
import com.og.service.OrderTableServiceImpl;
import com.og.service.productServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "orderServlet", urlPatterns = "/orderTable")
public class orderServlet extends HttpServlet {
    com.og.service.productService productService;
    OrderTableService orderTableService;
    @Override
    public void init() throws ServletException {
        productService = new productServiceImpl();
        orderTableService = new OrderTableServiceImpl();

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
                break;
            case "edit":
                break;
            case "delete":
                break;
            default:
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
            case "create":
                showCreateOrderTablePage(req,resp);
                break;
            case "edit":
                break;
            case "order":
                showOrderTablePage(req,resp);
                break;
            case "delete":
                break;
            default:
                showOrderTablePage(req,resp);
                break;
        }
    }
    public void  showCreateOrderTablePage(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        RequestDispatcher dispatcher = req.getRequestDispatcher("cp/order/orderTable/orderCreateList.jsp");
        List<Product> productList = productService.findAll();
        req.setAttribute("productList", productList);
        dispatcher.forward(req, resp);
    }
    private void showOrderTablePage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("cp/order/orderTable/list.jsp");
        List<OrderTableDTO> orderList = orderTableService.findAllOrderTableDTO();
        req.setAttribute("orderList", orderList);
        dispatcher.forward(req, resp);
    }
}

