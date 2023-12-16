package com.example.demo.Collection.List.Vector;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String args[]) {
        Vector<String> vec = new Vector<String>(7);
        //add() method of List
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        // addElement() method of Vector
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");

        System.out.println("Elements are: "+vec);

        //Check size and capacity
        System.out.println("Size: "+vec.size());  //7
        System.out.println("capacity: "+vec.capacity());  //7

        vec.addElement("Deer");
        System.out.println("Size: "+vec.size());  //8
        System.out.println("capacity: "+vec.capacity());  //14


    }
}
