package com.poizon.feign.pojo;
/*
 * @Project: poizon_springcloud
 * @Package: com.poizon.feign.pojo
 * @Class: User
 * @Author: White.Brown.Bottle
 * @Description:
 * @Date: 2022/6/11 23:27
 * @Version: 1.0
 */

import lombok.Data;

@Data
public class User {
    private Long id;
    private String userName;
    private String userAddress;
}
