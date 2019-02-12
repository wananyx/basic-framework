package com.jst.basic.framework.controller;

import com.jst.basic.framework.common.vo.Result;
import com.jst.basic.framework.config.enums.ExceptionEnums;
import com.jst.basic.framework.config.exception.JstException;
import com.jst.basic.framework.entity.User;
import com.jst.basic.framework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("findAll")
    public Result findAllUser(){
        try{
            List<User> users = userService.findAllUser();
            Result result = new Result();
            result.put("userList",users);
            return result;
        }catch (Exception e){
            throw new JstException(ExceptionEnums.ERROR);
        }
    }
}
