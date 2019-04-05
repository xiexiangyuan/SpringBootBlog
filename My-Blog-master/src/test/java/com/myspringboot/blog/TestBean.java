package com.myspringboot.blog;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class TestBean {


    @Test
    public void get(){

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
    }


    @Configuration
    public static class ConfigTest{



    }
}
