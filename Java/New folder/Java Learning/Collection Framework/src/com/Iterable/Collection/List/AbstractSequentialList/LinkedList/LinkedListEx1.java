package com.Iterable.Collection.List.AbstractSequentialList.LinkedList;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        System.out.println("LinkedListEx1");

        LinkedList<String> ll = new LinkedList<>();
        //Deque<String> ll = new LinkedList<>();

        ll.add("Abc");
        ll.add("xyz");
        ll.add("pqr");


        System.out.println(ll);

        Iterator<String> itr=ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        ll.forEach(a->{System.out.println(a);});

        itr.forEachRemaining(a->{System.out.println(a);});

        ll.addFirst("FirstAdd");
        ll.addLast("LastAdd");
        ll.forEach(a->{System.out.println(a);});



    }
}
