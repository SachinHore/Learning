package com.example.demo.ExceptionHandling;

public class TryCatchAndfinallyBlock {
    public static void main(String args[]){
        System.out.println("\nTryCatchBlock start");
        try{

            int data=100/0;

        }catch(ArithmeticException e){System.out.println(e);}

        try{

            String s=null;
            System.out.println(s.length());

        }catch(NullPointerException e){System.out.println(e);}

        try{

            String s="abc";
            int i=Integer.parseInt(s);

        }catch(NumberFormatException e){System.out.println(e);}

        try{

            int a[]=new int[5];
            a[10]=50;

        }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}


        finally {
            System.out.println("finally block is always executed");
        }


        System.out.println("rest of the code...");
    }
}
