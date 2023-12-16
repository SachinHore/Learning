package com.example.demo.OOPSConcept.Inheritance.MultipleInheritance;
interface A{

    void method(String a);
}

interface B  {

    void method(String a);
}

class C implements A,B {

    @Override
    public void method(String a) {System.out.println("class C method() ovrerride from interface A, B called using obj of class "+a);}

}

public class MultipleEx1 {

    public static void main(String args[]){
        System.out.println("\nMultipleInheritance.MultipleEx1 started");
        C d=new C();
        d.method("C");

    }

}
