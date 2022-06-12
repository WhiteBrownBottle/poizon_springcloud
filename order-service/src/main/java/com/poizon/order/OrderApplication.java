package com.poizon.order;
/*
 * @Project: poizon_springcloud
 * @Package: com.poizon.order
 * @Class: OrderApplication
 * @Author: White.Brown.Bottle
 * @Description:
 * @Date: 2022/6/11 23:03
 * @Version: 1.0
 */

import com.poizon.feign.clients.UserClient;
import com.poizon.feign.config.DefaultFeignConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@MapperScan("com.poizon.order.mapper")
@SpringBootApplication
@EnableFeignClients(clients = UserClient.class, defaultConfiguration = DefaultFeignConfiguration.class)
public class OrderApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
