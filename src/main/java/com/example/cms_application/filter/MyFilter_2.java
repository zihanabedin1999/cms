package com.example.cms_application.filter;
import jakarta.servlet.Filter;
import jakarta.servlet.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import  java.io.IOException;
import java.util.logging.LogRecord;
import jakarta.servlet.Filter;
@Component
@Order(1)
public class MyFilter_2 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 2 is called...");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
