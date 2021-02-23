package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class regist_filter_01
 */
@WebFilter("/regist_filter_01")
public class regist_filter_01 implements Filter {

    /**
     * Default constructor. 
     */
    public regist_filter_01() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		String username = req.getParameter("username");
		
		String url = req.getRequestURI();
		if(url.indexOf("RegisUserServlet")>=0) {
			if(username.contains("s")||username.contains("f")) {
				
				username = username.replace("s", "*");
				username = username.replace("f", "*");
//				System.out.println(username);
				HttpSession session = req.getSession();
				session.setAttribute("username", username);
				chain.doFilter(request, response);
//				res.sendRedirect("../html/index.html");
			}else {
				chain.doFilter(request, response);
			}
		}else {
			chain.doFilter(request, response);
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
