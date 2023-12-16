package com.CoreJava8.OOPSConcept.Inheritance.SingleInheritance;
class A{
    void methodA(String a){System.out.println("class A methodA() called using obj of class "+ a);}
}

class B extends A{
    void methodB(String a){System.out.println("class B methodB() called using obj of class "+ a);}
}

public class SingleEx1 {

    public static void main(String args[]){
        System.out.println("\nSingleInheritance.SingleEx1 started");
        B d=new B();
        d.methodA("B");
        d.methodB("B");
        //Thread.sleep(1000);


    }
}
