package com.mmall.service;

import com.google.common.collect.Maps;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Order;

import java.util.Map;

public interface IOrderService {

    ServerResponse pay(Long orderNo, Integer userId, String path);
    ServerResponse aliCallback(Map<String,String> params);
    ServerResponse queryOrderPayStatus(Integer userId,Long orderNo);


}
