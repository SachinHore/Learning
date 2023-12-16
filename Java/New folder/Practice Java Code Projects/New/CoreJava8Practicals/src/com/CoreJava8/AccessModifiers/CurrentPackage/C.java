package com.CoreJava8.AccessModifiers.CurrentPackage;

public class C {
    public void method(){
        A a= new A();

        //a.privateVariable=10;
        a.defaultVariable =10;
        a.protectedVariable=10;
        a.publicVariable =10;

        //a.privateMethod();
        a.defaultMethod();
        a.protectedMethod();
        a.publicMethod();
    }
}
