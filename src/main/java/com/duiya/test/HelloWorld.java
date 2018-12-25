package com.duiya.test;

import com.duiya.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
class HelloWorld {

    @Autowired
    private StudentService studentService;

    @RequestMapping("hello")
    @ResponseBody
    public Map<String, Object> showHelloWorld() {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "hello world!");
        return map;
    }
}
