package com.CoreJava8.OOPSConcept.Polymorphism.Runtime;
class A{
    void method(){
        System.out.println("class A method() called ");
    }

    void method1(){
        System.out.println("class A method1() called ");
    }
}

class B extends A{
    void method(){
        System.out.println("class B method() called ");
    }
    void method2(){
        System.out.println("class A method() called ");
    }
}


public class RuntimeEx1 {
    public static void main(String args[]){
        System.out.println("\nRuntime polymorphism called");
        A obj = new B();
        obj.method();
        obj.method1();


    }
}
