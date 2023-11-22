package com.example.cms_application.filter;


import jakarta.servlet.Filter;
import jakarta.servlet.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import  java.io.IOException;
import java.util.logging.LogRecord;
@Component
@Order(2)
public  class MyFilter_1 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 1 is called...");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    }


