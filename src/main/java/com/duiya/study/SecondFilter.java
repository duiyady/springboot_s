package com.duiya.study;

import javax.servlet.*;
import java.io.IOException;

/* springbot整合filter第二种方式*/
public class SecondFilter implements Filter {
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

