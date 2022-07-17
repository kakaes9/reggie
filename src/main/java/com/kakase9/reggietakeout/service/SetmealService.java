package com.kakase9.reggietakeout.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kakase9.reggietakeout.dto.SetmealDto;
import com.kakase9.reggietakeout.entity.Setmeal;

import java.util.List;

/**
 * @author yjt
 * @create 2022-07-11-14:14
 */
public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐和关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);
}
