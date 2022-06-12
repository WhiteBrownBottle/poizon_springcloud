package com.poizon.order.pojo;
/*
 * @Project: poizon_springcloud
 * @Package: com.poizon.order.pojo
 * @Class: Order
 * @Author: White.Brown.Bottle
 * @Description:
 * @Date: 2022/6/11 23:04
 * @Version: 1.0
 */
import com.poizon.feign.pojo.User;
import lombok.Data;

@Data
public class Order {
    private Long id;
    private Long userId;
    private String orderName;
    private Long orderPrice;
    private Integer orderNum;
    private User user;
}
