package com.CoreJava8.OOPSConcept.Abstraction.Interface;

public interface InterfaceEx2 {
    int a=10;

    void abstractMethodA(String a);

    default void defaultMethod(String a){System.out.println("Java 8 defaultMethod() declare in interfaceEx2 called using class "+a);}
    default void defaultMethod2(String a){System.out.println("Java 8 defaultMethod() declare in interfaceEx2 called using class "+a);}
    static void staticMethod(String a){System.out.println("Java 8 staticMethod() declare in interfaceEx2 called using nameof  class "+a);}

}
