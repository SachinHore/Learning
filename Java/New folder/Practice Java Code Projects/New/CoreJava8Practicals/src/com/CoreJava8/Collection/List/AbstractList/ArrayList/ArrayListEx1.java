package com.CoreJava8.Collection.List.AbstractList.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx1 {

    public static void main(String[] args) {
        System.out.println("ArraylistEx1");

        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(130);
        al.add(110);
        al.add(120);
        System.out.println("Direct object out"+al);



        System.out.println("For loop");
        for(int i=0; i< al.size();i++){
            System.out.println(al.get(i));
        }

        //Traversing through for-each
        System.out.println("For-each loop");
        for(int a : al){
            System.out.println(a);
        }

        //Traversing Arraylist through Iterator
        Iterator itr = al.iterator();
        System.out.println("Using Iterator");
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("Traversing list through forEach() method:");
        al.forEach(a->{ //Here, we are using lambda expression
            System.out.println(a);
        });


        System.out.println("Traversing list through forEachRemaining() method:");
        itr.forEachRemaining(a-> //Here, we are using lambda expression
        {
            System.out.println(a);
        });

        System.out.println("Get value at position at 1 : "+al.get(1));

        al.set(1,112);
        System.out.println("After Set value 112 at position 1 : "+al);


        //Sorting the elements of list

        Collections.sort(al);
        System.out.println("After list sort : "+al);

        System.out.println("Is ArrayList Empty: "+al.isEmpty());

        al.remove(1);
        System.out.println("After remove element at index 1 : "+al);



        List list=new ArrayList();
        list.add(al);
        list.add("String");
        System.out.println(list);
    }
}
