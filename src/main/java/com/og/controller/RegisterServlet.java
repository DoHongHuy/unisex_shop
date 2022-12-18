//package com.og.controller;
//
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.MultipartConfig;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.Part;
//import java.io.File;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//@WebServlet(name = "RegisterServlet", urlPatterns = "/RegisterServlet")
//public class RegisterServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        RequestDispatcher dispatcher = req.getRequestDispatcher("demo/register.jsp");
//        try {
//            String name = req.getParameter("name");
//            Part part = req.getPart("image");
//            String realPart = req.getServletContext().getRealPath("/images");
//            String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
//
//            if (!Files.exists(Paths.get(realPart))) {
//                Files.createDirectories(Paths.get(realPart));
//            }
//            part.write(realPart + "/" + filename);
//            try (PrintWriter out = resp.getWriter()) {
//                out.println("<h1>Name: " + name + "</h1>");
//                System.out.println(filename);
//                out.println("<img src = 'images/" + filename + "'width = '80' height = '80'>");
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        dispatcher.forward(req, resp);
//    }
//}
////
////    @Override
////    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//////        try {
//////            String name = req.getParameter("name");
//////            Part part = req.getPart("image");
//////
//////            String realPart = req.getServletContext().getRealPath("/images");
//////            String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
//////
//////
//////            if (!Files.exists(Paths.get(realPart))) {
//////                Files.createDirectories(Paths.get(realPart));
//////            }
//////            part.write(realPart + "/" + filename);
//////            try (PrintWriter out = resp.getWriter()){
//////                out.println("<h1>Name: " + name + "</h1>");
//////                out.println("<img src = 'images/" + filename + "'width = '80' height = '80'>");
//////
//////                System.out.println(filename);
//////                System.out.println(out);
//////            }
//////
//////        } catch (Exception e) {
//////            e.printStackTrace();
//////        }
//////
//////    }
////}