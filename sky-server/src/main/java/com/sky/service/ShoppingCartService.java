package com.sky.service;

import com.sky.dto.ShoppingCartDTO;

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
}
