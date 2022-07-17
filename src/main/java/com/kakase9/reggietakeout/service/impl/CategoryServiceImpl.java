package com.kakase9.reggietakeout.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kakase9.reggietakeout.common.CustomException;
import com.kakase9.reggietakeout.common.R;
import com.kakase9.reggietakeout.entity.Category;
import com.kakase9.reggietakeout.entity.Dish;
import com.kakase9.reggietakeout.entity.Setmeal;
import com.kakase9.reggietakeout.mapper.CategoryMapper;
import com.kakase9.reggietakeout.service.CategoryService;
import com.kakase9.reggietakeout.service.DishService;
import com.kakase9.reggietakeout.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author yjt
 * @create 2022-07-11-13:21
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;

    @Autowired
    private SetmealService setmealService;

    /**
     * 根据id删除之前需要进行判断
     * @param id
     */
    @Override
    public void remove(Long id) {
        //添加查询条件,根据分类id进行查询
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper=new LambdaQueryWrapper<>();


        dishLambdaQueryWrapper.eq(Dish::getCategoryId,id);
        int count1 = dishService.count(dishLambdaQueryWrapper);
        //查询当前分类是否关联了菜品，如果已经关联，抛出业务异常
        if (count1>0){
            //关联了菜品，抛出业务异常
            throw new CustomException("当前分类下关联了菜品，不能删除");
        }

        //查询当前分类是否关联了套餐，如果已经关联，抛出业务异常
        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper=new LambdaQueryWrapper<>();
        //添加查询条件,根据分类id进行查询
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId,id);
        int count2 = setmealService.count(setmealLambdaQueryWrapper);
        if (count2>0){
            //关联了套餐，抛出业务异常
            throw new CustomException("当前分类下关联了套餐，不能删除");
        }
        //可以删除
        super.removeById(id);
    }


}
