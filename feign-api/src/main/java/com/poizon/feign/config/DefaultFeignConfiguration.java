package com.poizon.feign.config;
/*
 * @Project: poizon_springcloud
 * @Package: com.poizon.feign.config
 * @Class: DefaultFeignConfiguration
 * @Author: White.Brown.Bottle
 * @Description:
 * @Date: 2022/6/11 23:27
 * @Version: 1.0
 */

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class DefaultFeignConfiguration {
    
    @Bean
    public Logger.Level logLevel() {
        return Logger.Level.BASIC;
    }
}
