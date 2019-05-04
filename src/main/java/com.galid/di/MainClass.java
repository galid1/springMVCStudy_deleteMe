package com.galid.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:di.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student.getName());
    }
}
