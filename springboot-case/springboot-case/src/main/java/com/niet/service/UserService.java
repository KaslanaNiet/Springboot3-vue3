package com.niet.service;

import com.niet.pojo.User;

public interface UserService {
    // 查询
    User findByUserName(String username);

    // 注册
    void register(String username, String password);
}
