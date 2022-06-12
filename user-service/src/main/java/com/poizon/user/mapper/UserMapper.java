package com.poizon.user.mapper;
/*
 * @Project: poizon_springcloud
 * @Package: com.poizon.user.mapper
 * @Class: UserMapper
 * @Author: White.Brown.Bottle
 * @Description:
 * @Date: 2022/6/11 22:37
 * @Version: 1.0
 */

import com.poizon.user.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    
    @Select("select * from poizon_user where id = #{id}")
    User findById(@Param("id") Long id);
}
