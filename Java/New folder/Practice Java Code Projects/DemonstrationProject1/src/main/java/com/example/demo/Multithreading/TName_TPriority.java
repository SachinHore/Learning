package com.company;

public class TName_TPriority {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Hi");
                try{Thread.sleep(1000);}catch(Exception e){}
            }
        },"Hi Thread");
        System.out.println(t1.getName());

        Thread t2 = new Thread(() -> {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Hello");
                try{Thread.sleep(1000);}catch(Exception e){}
            }
        });

        t2.setName("Hello Thread");
        System.out.println(t2.getName());

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.setPriority(1);
        System.out.println(t1.getPriority());

        t2.setPriority(10);
        System.out.println(t2.getPriority());

        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());

        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t2.getPriority());

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
