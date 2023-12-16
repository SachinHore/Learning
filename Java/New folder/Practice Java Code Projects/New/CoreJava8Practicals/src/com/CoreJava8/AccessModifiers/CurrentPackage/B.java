package com.CoreJava8.AccessModifiers.CurrentPackage;

public class B extends A{

    public void method(){
        //privateVariable=10;
        defaultVariable =10;
        protectedVariable=10;
        publicVariable =10;

        //privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
}
