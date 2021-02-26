package com.controller;

import com.pojo.User;
import com.server.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LoginUserServlet")
public class LoginUserServlet extends HttpServlet {



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String userpass = request.getParameter("userpass");
        User u = new User(username,userpass);
        ServiceImpl ss = new ServiceImpl();
        if (ss.queryUser(u)){
            HttpSession session = request.getSession();
            session.setAttribute("username",username);
            response.sendRedirect("jsp/selectMember.jsp");
        }else{
            response.sendRedirect("jsp/Login.jsp");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
