package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 菜品口味
 *
 * @author top
 * @date 2024/4/11 16:49
 */
@Mapper
public interface DishFlavorMapper {

    /**
     * 插入多条口味数据
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);

    /**
     * 根据菜品id批量删除对应的口味数据
     * @param ids
     */
    void deleteByDishIds(List<Long> ids);

    /**
     * 根据菜品id查询对应口味数据
     * @param dishId
     * @return
     */
    @Select("SELECT * from dish_flavor where dish_id=#{dishId}")
    List<DishFlavor> getByDishId(Long dishId);

    /**
     * 根据菜品id删除对应的口味数据
     * @param dishId
     */
    @Delete("delete from dish_flavor where dish_id=#{dishId}")
    void deleteByDishId(Long dishId);
}
