package com.java;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Validation implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String rollNo = servletRequest.getParameter("rollno");
        PrintWriter out=servletResponse.getWriter();

        if(rollNo.charAt(0) == 'R' && rollNo.charAt(1) == 'N'){
            filterChain.doFilter(servletRequest, servletResponse);
        }
        else{
            out.println("Invalid Roll Number format");
        }
    }

    public void destroy() {

    }
}
