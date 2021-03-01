package com.idea.controller;

import com.google.gson.Gson;
import com.idea.pojo.User;
import com.idea.server.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author lan
 * @date 2021/3/1 - 10:54
 */
public class ajaxQueryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("username");
        String upass = request.getParameter("userpass");
        User u = new User(uname,upass);

        ServiceImpl ss = new ServiceImpl();
        int flag = ss.addUser(u);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        if (flag==1){
            out.print(new Gson().toJson(u));
        }else{
            out.print(new Gson().toJson(new User()));
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
