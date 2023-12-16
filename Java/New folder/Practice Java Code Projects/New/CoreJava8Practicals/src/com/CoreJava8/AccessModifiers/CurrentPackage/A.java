package com.CoreJava8.AccessModifiers.CurrentPackage;

public class A {

    private int privateVariable;

    int defaultVariable;

    protected int protectedVariable;

    public int publicVariable;

    private void privateMethod(){}

    void defaultMethod(){}

    protected  void protectedMethod(){}

    public void publicMethod(){
    }


    public void main(){
        privateVariable=10;
        defaultVariable =10;
        protectedVariable=10;
        publicVariable =10;

        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
}
