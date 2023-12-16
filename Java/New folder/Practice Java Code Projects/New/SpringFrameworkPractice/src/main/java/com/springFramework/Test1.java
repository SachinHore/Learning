package com.springFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        //BeanFactory ctx = new XmlBeanFactory(new FileSystemResource("src/main/resources/spring.xml"));
        //Triangle triangle1 = (Triangle) ctx.getBean("triangle1");
        //triangle1.draw();

        //Application Context is Spring's advanced container.
        // Similar to BeanFactory, it can load bean definitions, wire beans together, and dispense beans upon request.
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring1.xml");
        ctx.registerShutdownHook();
        Triangle1 triangle1 = (Triangle1) ctx.getBean("triangle1");
        triangle1.draw();
     }
}
