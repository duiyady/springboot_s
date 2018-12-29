package com.duiya.controller;

import com.alibaba.fastjson.JSONObject;
import com.duiya.pojo.User;
import com.duiya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "addUser", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject addUser(@RequestParam(name="id",required=true)int id,
                              @RequestParam(name = "name", required = true) String name){
        int result = userService.addUser(new User(id, name));
        System.out.println(result);
        JSONObject jo = new JSONObject();
        jo.put("msg", "ok");
        jo.put("lll", "dafa");
        return jo;
    }
}
