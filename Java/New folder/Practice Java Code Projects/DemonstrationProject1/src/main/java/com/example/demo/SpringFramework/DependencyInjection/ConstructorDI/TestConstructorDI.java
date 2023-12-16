package com.example.demo.SpringFramework.DependencyInjection.ConstructorDI;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorDI {

    public static void main(String args[]) {


       ApplicationContext context = new ClassPathXmlApplicationContext("springDI.xml");
       Employee s = (Employee) context.getBean("emp");
       s.showDetails();


    }
}