package com.dubbo.service.impl;

import com.dubbo.service.DomeService;

public class DomeServiceImpl implements DomeService {
    public void getDome(String message) {
        System.out.println("service say:"+message);
    }
}
