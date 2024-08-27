package com.niet.service.impl;

import com.niet.mapper.UserMapper;
import com.niet.pojo.User;
import com.niet.service.UserService;
import com.niet.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findByUserName(String username) {
        User u = userMapper.findByUsername(username);
        return u;
    }

    @Override
    public void register(String username, String password) {
        // 加密
        String md5String = Md5Util.getMD5String(password);

        // 添加
        userMapper.add(username,md5String);

    }
}