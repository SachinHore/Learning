package com.springFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {

        //BeanFactory ctx = new XmlBeanFactory(new FileSystemResource("src/main/resources/spring.xml"));
        //Triangle triangle1 = (Triangle) ctx.getBean("triangle1");
        //triangle1.draw();

        //Application Context is Spring's advanced container.
        // Similar to BeanFactory, it can load bean definitions, wire beans together, and dispense beans upon request.
        ApplicationContext  ctx = new ClassPathXmlApplicationContext("spring3.xml");

        Shape3 shape3 = (Shape3) ctx.getBean("shape3");
        shape3.getTriangle3().draw();



     }
}
