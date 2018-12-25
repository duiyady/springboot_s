package com.duiya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan  //在springboot启动时会扫描@WebServlet并将该类实例化
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
