package com.duiya.base;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * springboot整合servlet 这个例子是通过注解扫描完成servlet组件注入
 * 在spring的配置中
 * <servlet>
 *     <servlet-name>firstServlet</servlet-name>
 *     <servlet-class>com.duiya.base.FirstServlet</servlet-class>
 * </servlet>
 * <servlet-mapping>
 *     <servlet-name>firstServlet</servlet-name>
 *     <url-pattern>/servlet1</url-pattern>
 * </servlet-mapping>
 *
 */

@WebServlet(name = "firstServlet", urlPatterns = "/servlet1")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("first servlet");
    }
}

