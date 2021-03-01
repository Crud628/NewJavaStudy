package com.idea.controller;

import com.google.gson.Gson;
import com.idea.server.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @author lan
 * @date 2021/3/1 - 16:48
 */
public class MemberPageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pages = request.getParameter("pageNum");
        int page = Integer.parseInt(pages);

        ServiceImpl ss = new ServiceImpl();
        ArrayList members = ss.queryMemberPage(page);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print(new Gson().toJson(members));
    }
}
