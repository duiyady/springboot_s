package com.duiya;

import com.duiya.study.SecondFilter;
import com.duiya.study.SecondListener;
import com.duiya.study.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;


//spring整合servlet filter等第一种方式
@SpringBootApplication
@ServletComponentScan  //在springboot启动时会扫描@WebServlet @WebFilter等并将这些类实例化
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}


/**
// 这是第二种整合servlet filter等的第二种方法，用这种时类上面的ServletComponentScan就不用了
@SpringBootApplication
class Main2 {
    public static void main(String[] args) {
        SpringApplication.run(Main2.class, args);
    }

    //注册servlet
    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new SecondServlet());
        servletRegistrationBean.addUrlMappings("/servlet2");
        return servletRegistrationBean;
    }

    //注册filter
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
        //bean.addUrlPatterns(new String[]{"*.do","*.jsp"});
        bean.addUrlPatterns("/servlet2");
        return bean;
    }

    //注册listener
    @Bean
    public ServletListenerRegistrationBean<SecondListener> getServletListenerRegistrationBean(){
        ServletListenerRegistrationBean<SecondListener> bean= new ServletListenerRegistrationBean<>(new SecondListener());
        return bean;
    }
}
 */





