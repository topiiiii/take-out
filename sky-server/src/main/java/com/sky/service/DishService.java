package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * 菜品
 *
 * @author top
 * @date 2024/4/11 16:37
 */
public interface DishService {

    /**
     * 新增菜品和对应口味
     * @param dishDTO
     */
    void saveWithFlavor(DishDTO dishDTO);
}
