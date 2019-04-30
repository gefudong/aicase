package com.sl.aicase.mapper;

import com.sl.aicase.model.User;

import java.util.List;

/**
 * Created by gefudong on 2019/4/26.
 */
public interface UserMapper {
    List<User> findUserInfo();
}
