package com.CoreJava8.OOPSConcept.Inheritance.HierarchicalInheritance;
class A{

    void methodA(String a){System.out.println("class A methodA() called using obj of class "+a);}
}

class B extends A {

    void methodB(String a){System.out.println("class B methodB() called using obj of class "+a);}
}

class C extends A {

    void methodC(String a){System.out.println("class C methodC() called using obj of class "+a);}
}

public class HirarchicalEx1 {

    public static void main(String args[]){
        System.out.println("\nHirerchicalInheritance.HirerchicalEx1 started");
        B d=new B();
        d.methodA("B");
        d.methodB("B");

        C d1=new C();
        d1.methodA("C");
        d1.methodC("C");
    }

}
