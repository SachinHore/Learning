package com.CoreJava8.Multithreading;

class App  extends Thread{
     volatile  boolean running = true;

    public void run(){
        while(running){
            System.out.println("Running");
            try{
                Thread.sleep(50);
            }catch(InterruptedException e){

            }
        }
    }

    public void shutDown(){
        System.out.println("After calling shutDown");
        this.running =false;
    }
}



public class Volatile {

    public static void main(String[] args) throws InterruptedException {
        App app = new App();
        app.start();
        Thread.sleep(5000);
        app.shutDown();


    }
}
