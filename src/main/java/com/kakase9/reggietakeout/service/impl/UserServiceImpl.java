package com.kakase9.reggietakeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kakase9.reggietakeout.entity.User;
import com.kakase9.reggietakeout.mapper.UserMapper;
import com.kakase9.reggietakeout.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author yjt
 * @create 2022-07-15-23:27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
