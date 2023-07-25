package com.example.demogroup4.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("FirstService")
public class PropertyServiceImpl implements PropertyService{

    @Value(value = "${my.test.property}")
    private String demoString;

    @Override
    public String getPropertyValue() {
        return demoString;
    }
}
