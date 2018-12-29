package com.duiya.base;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * springboot整合listener
 * <listener>
 *     <listener-class>com.duiya.base.FilstLIstener</listener-class>
 * </listener>
 */

@WebListener
public class FirstListener implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("Listener...destory......");
    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("Listener...init......");

    }

}
