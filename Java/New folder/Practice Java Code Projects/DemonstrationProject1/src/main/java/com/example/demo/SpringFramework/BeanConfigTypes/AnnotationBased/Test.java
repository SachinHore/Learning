package com.example.demo.SpringFramework.BeanConfigTypes.AnnotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args)
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        Employee emp = ctx.getBean(Employee.class);
        emp.setEmployee(111,"Sachin","Nanded","Maharashtra","123456");
        emp.showDetails();
    }
}
