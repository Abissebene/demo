package com.example.demo;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractRefreshableConfigApplicationContext;

import java.io.IOException;

import static org.junit.Assert.*;

public class StudentTest {
ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
Student student =(Student)applicationContext.getBean("Hugues");

    @Test
    public void getNameTest() {
        String result=student.getName();
        assertEquals(result,"Espoire");
    }
}