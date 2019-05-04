package com.galid.di;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name = "jjy";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
