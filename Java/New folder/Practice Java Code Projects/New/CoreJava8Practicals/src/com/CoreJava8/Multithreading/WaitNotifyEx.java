package com.CoreJava8.Multithreading;

class ThreadB extends Thread {
    int total;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("child thread starts calculation");
            for (int i = 1; i <= 100; i++) {
                total = total + i;
            }
            System.out.println("child thread giving notification");
            this.notify();
        }
    }
}

public class WaitNotifyEx {
    public static void main(String[] args) throws Exception{
        ThreadB tb = new ThreadB();
        tb.start();
        synchronized (tb){
            System.out.println("Main thread calling wait method");
            tb.wait(); //here we have lock of tb only so we can wait for tb only
            System.out.println("main thread got notification");
            System.out.println(tb.total);
        }
    }
}

