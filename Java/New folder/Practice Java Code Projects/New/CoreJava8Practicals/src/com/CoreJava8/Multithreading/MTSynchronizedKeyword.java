package com.CoreJava8.Multithreading;

class Counter{
    int count;
    int count1;

    public void increment(){
        count++;
    }
    public synchronized void increment1(){
        count1++;
    }
}

public class MTSynchronizedKeyword {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=1000;i++)
                {
                    c.increment();
                    c.increment1();
                }
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<=500;i++)
                {
                    c.increment();
                    c.increment1();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Count "+c.count);
        System.out.println("Count1 "+c.count1);
    }
}
