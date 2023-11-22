package com.example.cms_application.MyFilterConfig;

import com.example.cms_application.filter.MyNewFilter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configurable
@Configuration
public class MyFilterConfig {
    @Bean
    public FilterRegistrationBean<MyNewFilter> registrationBean() {

        FilterRegistrationBean<MyNewFilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new MyNewFilter());
        registrationBean.addUrlPatterns("/customers/*");

        return registrationBean;
    }
}
