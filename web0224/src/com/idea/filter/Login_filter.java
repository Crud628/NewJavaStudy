package com.idea.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Login_filter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;
        HttpSession session = request.getSession();
        if (session.getAttribute("username") != null ){
            chain.doFilter(req, resp);
        }else{
            response.sendRedirect("Login.jsp");
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
