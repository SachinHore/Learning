package com.CoreJava8.ExceptionHandling;

public  class Throwkeyword {
    static void method(int a){
        if(a < 10){
            throw new ArithmeticException("a is less than 10");
        }
        else {
            System.out.println("a is more than 10");
        }
    }

    public static void main(String args[]){
        System.out.println("\nThrow Keyword start");
        try {
            method(5);
        }catch (Exception e){System.out.println(e);}

        System.out.println("rest of the code...");
    }
}
