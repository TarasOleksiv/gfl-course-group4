package com.example.demogroup4.controller;

import com.example.demogroup4.service.PropertyService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {

    //@Autowired
    private final PropertyService propertyService;
    private final PropertyService propertySecondService;

    public PropertyController(@Qualifier("FirstService") PropertyService propertyService,
                              @Qualifier("SecondService") PropertyService propertySecondService) {
        this.propertyService = propertyService;
        this.propertySecondService = propertySecondService;
    }

    //http://localhost:8080/api/property
    @GetMapping("api/property")
    public ResponseEntity<String> getProperty() {
        return ResponseEntity.ok(propertyService.getPropertyValue());
    }

    //http://localhost:8080/api/property2
    @GetMapping("api/property2")
    public ResponseEntity<String> getProperty2() {
        return ResponseEntity.ok(propertySecondService.getPropertyValue());
    }
}
