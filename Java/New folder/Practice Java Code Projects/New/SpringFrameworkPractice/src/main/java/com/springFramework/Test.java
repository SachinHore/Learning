package com.springFramework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Test {
    public static void main(String[] args) {

        //BeanFactory ctx = new XmlBeanFactory(new FileSystemResource("src/main/resources/spring.xml"));
        //Triangle triangle1 = (Triangle) ctx.getBean("triangle1");
        //triangle1.draw();

        //Application Context is Spring's advanced container.
        // Similar to BeanFactory, it can load bean definitions, wire beans together, and dispense beans upon request.
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");


        System.out.println("Using Constructor");
        Triangle triangle1 = (Triangle) ctx.getBean("triangle1");
        triangle1.draw();
        Triangle triangle2 = (Triangle) ctx.getBean("triangle2");
        triangle2.draw();
        Triangle triangle3 = (Triangle) ctx.getBean("triangle3");
        triangle3.draw();
        Triangle triangle4 = (Triangle) ctx.getBean("triangle4");
        triangle4.draw();
        Triangle triangle5 = (Triangle) ctx.getBean("triangle5");
        triangle5.draw();
        Triangle triangle6 = (Triangle) ctx.getBean("triangle6");
        triangle6.draw();


        System.out.println("using setter");
        Triangle triangle7 = (Triangle) ctx.getBean("triangle7");
        triangle7.draw();

        //Bydefault each Bean scope is Singleton
        Triangle a = (Triangle) ctx.getBean("triangle7");
        System.out.println(a.getHeight());
        triangle7.setHeight(30);
        System.out.println(a.getHeight());

        System.out.println("shapes class");
        Shape shape1 = (Shape) ctx.getBean("shape1");
        shape1.getTriangle().draw();
        Shape shape2 = (Shape) ctx.getBean("shape2");
        System.out.println(shape2.getTriangle());
        Shape shape3 = (Shape) ctx.getBean("shape3");
        shape3.getTriangle().draw();

        System.out.println("scope=singleton");  //all singleton bean initialize at the time of Spring Bean initialization
                                                //one instance per IOC container
        Triangle triangle8 = (Triangle) ctx.getBean("triangle8");
        triangle8.setHeight(20);
        Triangle triangle9 = (Triangle) ctx.getBean("triangle8");
        System.out.println(triangle9.getHeight());
        triangle9.setHeight(30);
        System.out.println(triangle8.getHeight());

        System.out.println("scope=prototype"); //prototype beans waits to getBean after it beans initialize
                                                //many instances per IOC container
        Triangle triangle10 = (Triangle) ctx.getBean("triangle10");
        triangle10.setHeight(20);
        Triangle triangle11 = (Triangle) ctx.getBean("triangle10");
        System.out.println(triangle11.getHeight());
        triangle10.setHeight(30);
        System.out.println(triangle11.getHeight());

        //scope=request
        //This scopes a bean definition to an HTTP request.
        // Only valid in the context of a web-aware Spring ApplicationContext.

        //scope=session
        //This scopes a bean definition to an HTTP session.
        // Only valid in the context of a web-aware Spring ApplicationContext.

        //scope=global-session
        //This scopes a bean definition to a global HTTP session.
        // Only valid in the context of a web-aware Spring ApplicationContext.

        Triangle triangle12 = (Triangle) ctx.getBean("triangle12");
        triangle12.draw();
     }
}
