package com.sky.vo;

import com.sky.entity.OrderDetail;
import com.sky.entity.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderVO extends Orders implements Serializable {

    //订单菜品信息
    private String orderDishes;

    //订单详情
    private List<OrderDetail> orderDetailList;

/*
    {
        "code":1, "msg":null, "data":{
        "id":11, "number":"1713256492556", "status":6, "userId":4, "addressBookId":2, "orderTime":
        "2024-04-16 16:34", "checkoutTime":null, "payMethod":1, "payStatus":0, "amount":169.00, "remark":"", "userName":
        null, "phone":"15502877777", "address":null, "consignee":"大笨狗", "cancelReason":"用户取消", "rejectionReason":
        null, "cancelTime":"2024-04-17 00:40", "estimatedDeliveryTime":"2024-04-16 17:34", "deliveryStatus":
        0, "deliveryTime":null, "packAmount":2, "tablewareNumber":0, "tablewareStatus":0, "orderDishes":
        null, "orderDetailList":[{
            "id":6, "name":"鮰鱼2斤", "orderId":11, "dishId":67, "setmealId":null, "dishFlavor":"微辣", "number":
            1, "amount":72.00, "image":
            "https://sky-itcast.oss-cn-beijing.aliyuncs.com/8cfcc576-4b66-4a09-ac68-ad5b273c2590.png"
        },{
            "id":7, "name":"馋嘴牛蛙", "orderId":11, "dishId":64, "setmealId":null, "dishFlavor":null, "number":
            1, "amount":89.00, "image":
            "https://take-out-heima.oss-cn-beijing.aliyuncs.com/3d8b7c33-eafb-4494-ad6c-a4313eb09d2c.png"
        }]}
    }
* */
}
