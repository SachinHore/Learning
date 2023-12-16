package com.CoreJava8.Interface;

interface Interf{           //go for interface when we don't know anything about implemention
                            // and just we know required specification
    int a = 10;  //bydefaule public static final

    void m1();  //bydefault abstract public

    void m2();
}

abstract class Services implements Interf{     //go for abstract class when we don't know fully about implemention
                                                //have to implement partially
    @Override
    public void m1() {
        System.out.println("method m1");
    }
}

class ServicesRemImpl extends Services{

    @Override
    public void m2() {

    }
}

class InterfImpl implements Interf{    //go for class when we know fully about implemention
    @Override
    public void m1() {
        System.out.println("method m1");
    }

    @Override
    public void m2() {
        System.out.println("method m2");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("1");
        Interf s = new InterfImpl();
        s.m1();
        s.m2();


        Services s1 = new Services() {
            @Override
            public void m2() {
                System.out.println("method m2");
            }
        };
        System.out.println("2");
        s1.m1();
        s1.m2();
        //or
        Services s2 = new ServicesRemImpl();
        System.out.println("3");
        s2.m1();
        s2.m2();
    }
}





