package com.example.demo.OOPSConcept.Abstraction.Interface;

import org.springframework.beans.factory.annotation.Autowired;

interface C{

    void abstractMethodC(String a);
}

interface A extends C{

    void abstractMethodA(String a);

    default void defaultMethod(String a){System.out.println("Java 8 defaultMethod() declare in interface A called using class "+a);}
    static void staticMethod(String a){System.out.println("Java 8 staticMethod() declare in interface A called using nameof  class "+a);}
}
interface D extends A{

}

class B implements A{

    @Override
    public void abstractMethodA(String a) {
        System.out.println("class B abstractMethodA() overrride from interface A called using obj of class "+a);
    }

    @Override
    public void abstractMethodC(String a) {
        System.out.println("class B abstractMethodC() overrride from interface C called using obj of class "+a);
    }
}

class BB implements A{

    @Override
    public void abstractMethodA(String a) {
        System.out.println("class BB abstractMethodA() overrride from interface A called using obj of class "+a);
    }

    @Override
    public void abstractMethodC(String a) {
        System.out.println("class BB abstractMethodC() overrride from interface C called using obj of class "+a);
    }
}


public class InterfaceEx1 {

    public static void main(String args[]){

        System.out.println("\nAbstraction using Interface start");

        B d = new B();
        d.abstractMethodA("B");
        d.abstractMethodC("B");
        d.defaultMethod("B");
        A.staticMethod("A");



    }
}
