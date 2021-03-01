package com.idea.controller;

import com.google.gson.Gson;
import com.idea.pojo.Member;
import com.idea.server.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author lan
 * @date 2021/3/1 - 12:50
 */
public class memberList extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServiceImpl ss = new ServiceImpl();
        List<Member> members = ss.queryAll();

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print(new Gson().toJson(members));
    }
}
