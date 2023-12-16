package com.CoreJava8.Collection.Set.SortedSet.TreeSet;



import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {

        SortedSet<Integer> values = new TreeSet<>();

        System.out.println(values.add(50)); //true
        System.out.println(values.add(30)); //true
        System.out.println(values.add(97)); //true
        System.out.println(values.add(34)); //true
        //System.out.println(values.add(null)); //null not allowed
        System.out.println(values.add(50)); //false Duplicate elements not allowed


        System.out.println(values); //[30, 34, 50, 97]  Ascendinng order maintains

    }
}
