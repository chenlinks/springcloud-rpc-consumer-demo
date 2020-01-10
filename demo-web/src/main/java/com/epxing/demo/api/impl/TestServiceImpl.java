package com.epxing.demo.api.impl;

import com.epxing.demo.api.TestApi;
import com.epxing.demo.api.TestService;
import com.epxing.demo.domain.TestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenling
 * @date 2020/1/6 1:23
 * @since V1.0.0
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestApi testApi;


    @Override
    public void testEntity(String name) {
        TestResult entity = testApi.getEntity(name);
        System.out.println(entity);
    }

}
