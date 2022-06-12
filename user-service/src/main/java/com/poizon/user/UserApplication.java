package com.poizon.user;
/*
 * @Project: poizon_springcloud
 * @Package: com.poizon.user
 * @Class: UserApplication
 * @Author: White.Brown.Bottle
 * @Description:
 * @Date: 2022/6/11 22:40
 * @Version: 1.0
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.poizon.user.mapper")
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
    
}
