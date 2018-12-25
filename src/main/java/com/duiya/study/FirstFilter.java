package com.duiya.study;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 注解注入filter的方式，spring需要这样配置
 *  <filter>
 *  	<filter-name>FirstFilter</filter-name>
 *  	<filter-class>com.bjsxt.filter.FirstFilter</filter-class>
 *  </filter>
 *  <filter-mapping>
 *  	<filter-name>FirstFilter</filter-name>
 *  	<url-pattern>/first</url-pattern>
 *  </filter-mapping>
 *
 */
//@WebFilter(filterName = "firstFilter", urlPatterns = {"*.do", "*.jsp"}) //拦截多个
@WebFilter(filterName = "firstFilter", urlPatterns = "/servlet1") //只拦截 /servlet1
public class FirstFilter implements Filter {
    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }
    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
        System.out.println("进入Filter");
        arg2.doFilter(arg0, arg1);
        System.out.println("离开Filter");
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub
    }


}
