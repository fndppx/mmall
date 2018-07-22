package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

public interface IUserSerivice {
   ServerResponse<User> login(String username, String password);
}
