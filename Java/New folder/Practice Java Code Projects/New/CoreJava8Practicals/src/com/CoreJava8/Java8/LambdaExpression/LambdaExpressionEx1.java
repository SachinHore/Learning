package com.CoreJava8.Java8.LambdaExpression;
//works with functionl interface
interface A{
    void abstractMethod();
}
/*
class B implements A{

    @Override
    public void abstractMethod() {
        System.out.println("LambdaExpression");
    }
}*/


public class LambdaExpressionEx1 {
    public static void main(String[] args) {

        System.out.println("LambdaExpressionEx1 start");

        //A obj = new B();

        A obj = ()->{System.out.println("LambdaExpression");};

        obj.abstractMethod();



    }

}
