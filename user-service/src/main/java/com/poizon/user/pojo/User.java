package com.poizon.user.pojo;
/*
 * @Project: poizon_springcloud
 * @Package: com.poizon.user.pojo
 * @Class: User
 * @Author: White.Brown.Bottle
 * @Description:
 * @Date: 2022/6/11 22:21
 * @Version: 1.0
 */

import lombok.Data;

@Data
public class User {
    private Long id;
    private String userName;
    private String userAddress;
    
}
