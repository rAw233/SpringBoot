package com.springboot.springboot.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(filterName = "MyFilter",urlPatterns = "/filter")
public class MyFilter implements Filter {
    /*在项目启动的时候会执行*/
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init~");
    }

    /*在请求urlPatterns配置的路径时候会执行*/
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter");
    }

    /*在项目停止之前会执行*/
    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
