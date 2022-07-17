package com.kakase9.reggietakeout.dto;


import com.kakase9.reggietakeout.entity.Dish;
import com.kakase9.reggietakeout.entity.DishFlavor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
