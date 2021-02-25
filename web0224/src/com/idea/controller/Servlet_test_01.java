package com.idea.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet_test_01
 */
@WebServlet("/Servlet_test_01")
public class Servlet_test_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_test_01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.write("<h1>Servlet 01</h1>");

		//服务器存储
		//session  作用域
		//默认：有效存储时长：停止与服务器交互30分钟
//		更改session作用域时长
		
		HttpSession session = request.getSession();
//		session.setMaxInactiveInterval(5);//更改session时长为5s   method1
//		method 2 web.xml中
//		  <session-config>
//		  	<session-timeout>1</session-timeout>
//		  </session-config>
		
		String str = "服务器存储测试";
//		session.setAttribute("val", str);
//		session.getAttribute(arg0)   取数据
//		session.removeAttribute(arg0);  删数据
//		ServletContext application =request.getSession().getServletContext();
//		pw.flush();
//		pw.close();
		
		
		request.setAttribute("val_05",str);
//		request.getRequestDispatcher("Servlet_test_02").forward(request, response);
		response.sendRedirect("Servlet_test_02");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
