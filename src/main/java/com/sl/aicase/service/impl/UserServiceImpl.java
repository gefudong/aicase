package com.sl.aicase.service.impl;

import com.sl.aicase.mapper.UserMapper;
import com.sl.aicase.model.User;
import com.sl.aicase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gefudong on 2019/4/26.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUserAll(){
        return this.userMapper.findUserInfo();
    }

}
