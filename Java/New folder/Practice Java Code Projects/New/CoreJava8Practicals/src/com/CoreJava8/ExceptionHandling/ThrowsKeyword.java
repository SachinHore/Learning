package com.CoreJava8.ExceptionHandling;

//It gives an information to the programmer that there may occur an exception
class A{
    void method() throws ArithmeticException
    {
        throw new ArithmeticException("Arith matic exception occur");
    }
}

public class ThrowsKeyword {
    public static void main(String args[]){
        System.out.println("\nThrows Keyword start");
        A obj =new A();
        try {
            obj.method();
        }catch (ArithmeticException e){System.out.println(e);}

        System.out.println("rest of code");

    }


}
