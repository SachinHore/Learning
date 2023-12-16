package com.CoreJava8.OOPSConcept.Inheritance.MultilevelInheritance;

class A{

    void methodA(String a){System.out.println("class A methodA() called using obj of class "+a);}
}

class B extends A {

    void methodB(String a){System.out.println("class B methodB() called using obj of class "+a);}
}

class C extends B {

    void methodC(String a){System.out.println("class C methodC() called using obj of class "+a);}
}


public class MultilevelEx1 {

    public static void main(String args[]){
        System.out.println("\nMultilevelInheritance.MultilevelEx1 started");
        C d=new C();
        d.methodA("C");
        d.methodB("C");
        d.methodC("C");
    }


}