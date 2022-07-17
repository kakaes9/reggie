package com.kakase9.reggietakeout.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.kakase9.reggietakeout.entity.Orders;

public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
