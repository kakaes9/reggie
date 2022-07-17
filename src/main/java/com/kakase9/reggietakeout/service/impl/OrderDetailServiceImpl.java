package com.kakase9.reggietakeout.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kakase9.reggietakeout.entity.OrderDetail;
import com.kakase9.reggietakeout.mapper.OrderDetailMapper;
import com.kakase9.reggietakeout.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}