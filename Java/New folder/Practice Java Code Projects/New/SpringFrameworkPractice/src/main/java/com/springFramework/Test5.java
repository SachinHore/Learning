package com.springFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring5.xml");
        ctx.registerShutdownHook();
        Shape5 shape5 = (Shape5) ctx.getBean("shape5");
        shape5.getTriangle().draw();



     }
}
