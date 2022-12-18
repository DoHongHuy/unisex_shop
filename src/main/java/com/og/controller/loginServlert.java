package com.og.controller;


import com.og.model.Account;
import com.og.service.LoginService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "loginServlert", urlPatterns = "/login")
public class loginServlert extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("cp/userLogin/login.jsp");
        resp.setContentType("text/html;charset =UTF-8");
        List<String> error = null;
        try {
            String user = req.getParameter("username");
            String pass = req.getParameter("password");
            LoginService loginService = new LoginService();
            Account a = loginService.checkLogin(user, pass);
            error = new ArrayList<>();
            System.out.println("vao ser vleare");
            if (a == null) {
//                resp.sendRedirect("login");
                error.add("Nhập sai..Vui lòng đăng nhập lại");
                req.setAttribute("errors", error);
                dispatcher.forward(req,resp);
            } else {
                resp.sendRedirect("product");
                System.out.println("dung");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (error.size() > 0) {
            req.setAttribute("errors", error);
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("cp/userLogin/login.jsp");
        dispatcher.forward(req, resp);

    }
}
