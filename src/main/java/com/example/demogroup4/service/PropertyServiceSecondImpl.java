package com.example.demogroup4.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("SecondService")
public class PropertyServiceSecondImpl implements PropertyService{

    @Value(value = "${my.test.property2:demo2}")
    private String demoString;

    @Override
    public String getPropertyValue() {
        return demoString;
    }
}
