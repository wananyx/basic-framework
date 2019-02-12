package com.jst.basic.framework.service.impl;

import com.jst.basic.framework.config.enums.ExceptionEnums;
import com.jst.basic.framework.config.exception.JstException;
import com.jst.basic.framework.dao.UserMapper;
import com.jst.basic.framework.entity.User;
import com.jst.basic.framework.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findAllUser() {
        List<User> users = userMapper.selectAll();
        if(users==null){
            throw new JstException(ExceptionEnums.NOT_FOUND);
        }
        return users;
    }
}
