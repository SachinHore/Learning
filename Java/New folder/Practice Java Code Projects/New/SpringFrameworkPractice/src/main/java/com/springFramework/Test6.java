package com.springFramework;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {
    public static void main(String[] args) {

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring6.xml");
        ctx.registerShutdownHook();
        Shape6 shape6 = (Shape6) ctx.getBean("Shape6");
        shape6.getTriangle().draw();

     }
}
