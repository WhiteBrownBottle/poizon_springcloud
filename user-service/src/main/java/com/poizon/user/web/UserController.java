package com.poizon.user.web;
/*
 * @Project: poizon_springcloud
 * @Package: com.poizon.user.web
 * @Class: UserController
 * @Author: White.Brown.Bottle
 * @Description:
 * @Date: 2022/6/11 23:59
 * @Version: 1.0
 */

import com.poizon.user.pojo.User;
import com.poizon.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/user")
@RefreshScope
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id,
                          @RequestHeader(value = "Poizon", required = false) String Poizon) {
        System.out.println("Poizon: " + Poizon);
        return userService.queryById(id);
    }
    
}
