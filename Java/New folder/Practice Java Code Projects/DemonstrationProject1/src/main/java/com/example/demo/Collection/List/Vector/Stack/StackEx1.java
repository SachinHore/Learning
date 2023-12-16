package com.example.demo.Collection.List.Vector.Stack;

import java.util.Iterator;
import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args)
    {

        Stack<Integer> stk= new Stack<>();

        // checking stack is empty or not
        System.out.println("Is stack empty? " + stk.empty());

        // pushing elements into stack
        stk.push(78);
        stk.push(113);
        stk.push(90);
        stk.push(120);

        //prints elements of the stack
        System.out.println("Elements in Stack: " + stk);

        System.out.println("Is stack empty? " + stk.empty());

        System.out.println("Peek element get " + stk.peek());

        System.out.println("Pop element get and remove " + stk.pop());

        System.out.println("Elements in Stack: " + stk);

        System.out.println("Search element and get index of it " + stk.search(90));

        System.out.println("Iterating the stack : ");
        Iterator iterator = stk.iterator();
        while(iterator.hasNext())
        {
            Object values = iterator.next();
            System.out.println(values);
        }

        System.out.println("Iteration using forEach() Method:");
        stk.forEach(n -> {
            System.out.println(n);
        });
    }
}
