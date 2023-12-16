package com.CoreJava8.AccessModifiers.Outsidepackageanother;

import com.CoreJava8.AccessModifiers.OutsidePackage.E;

public class F extends E {
    public void method(){
        //privateVariable=10;
        //defaultVariable =10;
        protectedVariable=10;
        publicVariable =10;

        //privateMethod();
        //defaultMethod();
        protectedMethod();
        publicMethod();
    }
}
