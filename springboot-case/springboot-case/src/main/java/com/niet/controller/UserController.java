package com.niet.controller;

import com.niet.pojo.Result;
import com.niet.pojo.User;
import com.niet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(String username, String password) {
        // 查询用户
        User u = userService.findByUserName(username);

        if (u==null){
            // 证明用户名没有占用
            // 注册用户
            userService.register(username,password);
            return Result.success();
        }else {
            // 占用了
            return Result.error("用户名已被占用");
        }
    }
}
