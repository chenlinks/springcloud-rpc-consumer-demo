package com.epxing.demo.api;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author chenling
 * @date 2020/1/6 1:21
 * @since V1.0.0
 */

public interface TestService {

     void  testEntity(String name);


}
