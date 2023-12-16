package com.example.demo.SpringFramework.DependencyInjection.SetterDI;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetterDI {

    public static void main(String args[]) {


       ApplicationContext context = new ClassPathXmlApplicationContext("springDI.xml");
       Employee s = (Employee) context.getBean("emp1");
       s.showDetails();


    }
}