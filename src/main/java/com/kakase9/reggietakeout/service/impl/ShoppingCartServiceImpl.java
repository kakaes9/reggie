package com.kakase9.reggietakeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kakase9.reggietakeout.entity.ShoppingCart;
import com.kakase9.reggietakeout.mapper.ShoppingCartMapper;
import com.kakase9.reggietakeout.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
