package com.poizon.order.web;
/*
 * @Project: poizon_springcloud
 * @Package: com.poizon.order.web
 * @Class: OrderController
 * @Author: White.Brown.Bottle
 * @Description:
 * @Date: 2022/6/11 23:44
 * @Version: 1.0
 */

import com.poizon.order.pojo.Order;
import com.poizon.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {
    
    @Autowired
    private OrderService orderService;
    
    @GetMapping("{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId) {
        // 根据id查询订单并返回
        return orderService.queryOrderById(orderId);
    }
}
