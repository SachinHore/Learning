package com.springFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {

        ApplicationContext  ctx = new ClassPathXmlApplicationContext("spring4.xml");

        Shape4 shape4 = (Shape4) ctx.getBean("shape4");
        shape4.getTriangle().draw();



     }
}
