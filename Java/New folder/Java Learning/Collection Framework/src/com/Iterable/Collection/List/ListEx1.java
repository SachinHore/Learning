package com.Iterable.Collection.List;

import java.util.*;

public class ListEx1 {
    public static void main(String[] args) {
        System.out.println("ListEx1");

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();
        List<Integer> list3 = new Vector<Integer>();
        List<Integer> list4 = new Stack<Integer>();

        System.out.println("list1 :"+list1);
        System.out.println("list2 :"+list2);
        System.out.println("list3 :"+list3);
        System.out.println("list4 :"+list4);

        list1.add(234);
        list2.add(235);
        list3.add(236);
        list4.add(237);


        System.out.println("list1 :"+list1);
        System.out.println("list2 :"+list2);
        System.out.println("list3 :"+list3);
        System.out.println("list4 :"+list4);
    }
}
