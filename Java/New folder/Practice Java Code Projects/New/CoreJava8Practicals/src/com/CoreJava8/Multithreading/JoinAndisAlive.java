package com.CoreJava8.Multithreading;

public class JoinAndisAlive {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Hi"+i);
                try{Thread.sleep(3000);}catch(Exception e){}

            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Hello"+i);
                try{Thread.sleep(5000);}catch(Exception e){}
            }
        });

        t1.start();
        try{Thread.sleep(10);}catch(Exception e){}
        t2.start();



        System.out.println(t1.isAlive());
        System.out.println("BYE before join");

        t1.join();
        t2.join();

        System.out.println(t1.isAlive());

        System.out.println("BYE after join");
    }
}
