package com.CoreJava8.OOPSConcept.Inheritance.MultipleInheritance;
interface A{
    int x = 10;
    void method(String a);
}

interface B  {
    int x= 20;
    void method(String a);
}

class C implements A,B {

    @Override
    public void method(String a) {
        System.out.println("class C method() override from interface A, B called using obj of class "+a);
        System.out.println(A.x);
        System.out.println(B.x);
    }
}

public class MultipleEx1 {

    public static void main(String args[]){
        System.out.println("\nMultipleInheritance.MultipleEx1 started");
        C d=new C();
        d.method("C");

    }

}
