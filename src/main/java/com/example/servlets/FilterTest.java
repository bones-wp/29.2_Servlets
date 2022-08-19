package com.example.servlets;

import javax.servlet.*;
import java.io.IOException;

public class FilterTest implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //Выведем ip адрес подключения в консоль
        String ipAddress = servletRequest.getRemoteAddr();
        System.out.println(ipAddress);

        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy(){

    }

}
