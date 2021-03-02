package com.idea.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletAjax extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doGet(request, response);
        System.out.println("post run");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String ss = request.getParameter("test_val");
        System.out.println(ss);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print(ss);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet Ajax run...");
        request.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        String xx1 = request.getParameter("xx1");
        String xx2 = request.getParameter("xx2");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("servletAaaa run "+xx1+" "+xx2);

    }
}