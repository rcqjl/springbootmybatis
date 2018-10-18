package com.inspur.mybatisDemo.service;

import com.inspur.mybatisDemo.bean.User;

import java.util.List;

/**
 * Created by qujianlong on 2018/10/8.
 */
public interface UserService {

    int addUser(User user);


    List<User> findAllUser(int pageNum, int pageSize);

}
