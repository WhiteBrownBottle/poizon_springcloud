package com.poizon.order.mapper;
/*
 * @Project: poizon_springcloud
 * @Package: com.poizon.order.mapper
 * @Class: OrderMapper
 * @Author: White.Brown.Bottle
 * @Description:
 * @Date: 2022/6/11 23:08
 * @Version: 1.0
 */

import com.poizon.order.pojo.Order;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {
    
    @Select("select * from poizon_order where id = #{id}")
    Order findById(Long id);
}
