package com.kakase9.reggietakeout.dto;


import com.kakase9.reggietakeout.entity.Setmeal;
import com.kakase9.reggietakeout.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
