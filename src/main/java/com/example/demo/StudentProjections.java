package com.example.demo;

import org.springframework.data.rest.core.config.Projection;

//@Projection(name = "students", types=Student.class)
public interface StudentProjections {
     Long getId();
     String getName();
     int getAge();
}

