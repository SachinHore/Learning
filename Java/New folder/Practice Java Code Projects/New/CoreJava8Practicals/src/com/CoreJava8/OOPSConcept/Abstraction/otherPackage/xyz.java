package com.CoreJava8.OOPSConcept.Abstraction.otherPackage;

import com.CoreJava8.OOPSConcept.Abstraction.Interface.Abc;
import com.CoreJava8.OOPSConcept.Abstraction.Interface.InterfaceEx2;


class pqr implements InterfaceEx2 {

    @Override
    public void abstractMethodA(String a) {

    }
}

public class xyz  {

    public static void main(String[] args) {
        pqr obj = new pqr();
        obj.abstractMethodA("abc");
        obj.defaultMethod("xyz");

        Abc obj1 = new Abc();
        obj1.defaultMethod("mm jghk");
    }
}


