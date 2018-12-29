package com.duiya.controller;

import com.alibaba.fastjson.JSONObject;
import com.duiya.pojo.Account;
import com.duiya.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "regist", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject regist(@Valid Account account, BindingResult result){
        JSONObject jo = new JSONObject();
        if(result.hasErrors()){
            jo.put("error", result.getFieldError().getField() + ":" + result.getFieldError().getDefaultMessage());
        }
        jo.put("msg", "ok");
        accountService.regist(account);
        System.out.println(account);
        return jo;
    }
}
