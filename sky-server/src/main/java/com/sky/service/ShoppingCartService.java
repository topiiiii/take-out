package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

/**
 * 类描述
 *
 * @author top
 * @date 2024/4/14 17:46
 */
public interface ShoppingCartService {

    /***
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);

    /**
     * 获取购物车数据
     * @return
     */
    List<ShoppingCart> showShoppingCart();

    /**
     * 清空购物车数据
     */
    void cleanShoppingCart();

    /**
     * 删除购物车中一个商品
     * @param shoppingCartDTO
     */
    void subShoppingCart(ShoppingCartDTO shoppingCartDTO);

}
