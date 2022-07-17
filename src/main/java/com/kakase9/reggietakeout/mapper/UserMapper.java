package com.kakase9.reggietakeout.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kakase9.reggietakeout.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yjt
 * @create 2022-07-15-23:25
 */
@Mapper
public interface UserMapper  extends BaseMapper<User> {
}
