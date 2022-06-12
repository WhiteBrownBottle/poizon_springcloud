package com.poizon.user.service;
/*
 * @Project: poizon_springcloud
 * @Package: com.poizon.user.service
 * @Class: UserService
 * @Author: White.Brown.Bottle
 * @Description:
 * @Date: 2022/6/11 22:38
 * @Version: 1.0
 */

import com.poizon.user.mapper.UserMapper;
import com.poizon.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserMapper userMapper;
    
    public User queryById(Long id) {
        return userMapper.findById(id);
    }
}
