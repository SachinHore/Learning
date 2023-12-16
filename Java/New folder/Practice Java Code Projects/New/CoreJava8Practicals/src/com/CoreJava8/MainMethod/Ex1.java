package com.CoreJava8.MainMethod;

public class Ex1 {

    {
        System.out.println("Init block Ex1");
    }

    static {
        System.out.println("Static block1 Ex1 ");
    }

    public static void main(String[] args) {

        System.out.println("main start B create");
        B ab = new B();
        B ab1 = new B();
        System.out.println("over");
        {
            System.out.println("Init block1 main");
        }

        System.out.println("Ex1 create");
        Ex1 a = new Ex1();

    }

    static {
        System.out.println("Static block2 Ex1");
    }


}

class B {
    public B(){
        System.out.println("constructor B");
    }
    {
        System.out.println("Init block B");
    }

    static{
        System.out.println("Stactic block2 B");
    }


}

