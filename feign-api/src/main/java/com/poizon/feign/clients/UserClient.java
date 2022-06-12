package com.poizon.feign.clients;
/*
 * @Project: poizon_springcloud
 * @Package: com.poizon.feign.clients
 * @Class: UserClient
 * @Author: White.Brown.Bottle
 * @Description:
 * @Date: 2022/6/11 23:26
 * @Version: 1.0
 */

import com.poizon.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "userservice")
public interface UserClient {
    
    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);
}
