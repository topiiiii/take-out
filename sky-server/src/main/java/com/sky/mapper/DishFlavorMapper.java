package com.sky.mapper;

import com.sky.annotation.AutoFill;
import com.sky.entity.DishFlavor;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Mapper;

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
    void insert(List<DishFlavor> flavors);

}
