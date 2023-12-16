package com.example.demo.OOPSConcept.Abstraction.AbstractClass;

abstract class A{

    public A(){
        System.out.println("constructor of abstract class A called ");
    }

    public static void staticMethod(String a){
        System.out.println("abstract class A staticMethod() declare in abstract class A called using "+a);
    }

    public final void finalMethod(String a){
        System.out.println("abstract class A finalMethod() declare in abstract class A called using obj of class "+a);
    }

    void simpleMethod(String a){
        System.out.println("abstract class A simpleMethod() declare in abstract class A called using obj of class "+a);
    }

    abstract void abstractMethod(String a);

}

class B extends A {

    @Override
    void abstractMethod(String a) {
        System.out.println("class B abstractMethod() overrride from abstract class A and declare in class B called using obj of class "+a);
    }
}

public class AbstractClassEx1 {
    public static void main(String args[]){

        System.out.println("\nAbstraction using Abstract class start");
        B d = new B();
        d.simpleMethod("B");
        d.abstractMethod("B");
        d.finalMethod("B");
        A.staticMethod("Name of class A");
    }
}
