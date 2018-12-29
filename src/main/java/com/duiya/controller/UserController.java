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

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "addUser", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject addUser(@RequestParam(name="id")int id,
                              @RequestParam(name = "name", required = false) String name){
        int result = userService.addUser(new User(id, name));
        System.out.println(result);
        JSONObject jo = new JSONObject();
        jo.put("msg", "ok");
        jo.put("lll", "dafa");
        return jo;
    }

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject getAll(){
        List<Map<String, Object>> list = userService.getAll();
        JSONObject jo = new JSONObject();
        jo.put("msg", list);
        jo.put("lll", "dafa");
        return jo;
    }


}
