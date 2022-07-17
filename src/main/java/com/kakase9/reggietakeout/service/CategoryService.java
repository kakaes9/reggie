package com.kakase9.reggietakeout.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kakase9.reggietakeout.entity.Category;
import org.springframework.stereotype.Service;

/**
 * @author yjt
 * @create 2022-07-11-13:20
 */

public interface CategoryService extends IService<Category> {
    public abstract void remove(Long id);
}
