package com.CoreJava8.OOPSConcept.Polymorphism.Compiletime;
class A{
    void method(){
        System.out.println("method() called");
    }

    void method(int a){
        System.out.println("method(int a) called");
    }

    void method(String a){
        System.out.println("method(String a) called");
    }

    void method(int a,String b){
        System.out.println("method(int a,String b)");
    }
    void method(String b,int a){
        System.out.println("method(int a,String b)");
    }
}

class B extends A{
    void methodOverload(){
        method();
        method(5);
        method("abc");
        method(6,"xyz");
        method("pqr",7);
    }
}


public class CompiletimeEx1 {
    public static void main(String args[]){
        System.out.println("\nCompile time Polymorphism start");
        B obj = new B();
        obj.methodOverload();

    }
}
