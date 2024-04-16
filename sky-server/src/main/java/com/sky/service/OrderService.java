package com.sky.service;

import com.sky.dto.OrdersSubmitDTO;
import com.sky.vo.OrderSubmitVO;

/**
 * 类描述
 *
 * @author top
 * @date 2024/4/16 12:56
 */
public interface OrderService {
    /**
     * 用户提交订单
     * @param ordersSubmitDTO
     * @return
     */
    OrderSubmitVO submintOrder(OrdersSubmitDTO ordersSubmitDTO);
}
