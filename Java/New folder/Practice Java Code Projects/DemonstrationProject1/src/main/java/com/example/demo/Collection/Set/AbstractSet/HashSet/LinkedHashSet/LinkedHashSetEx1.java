package com.example.demo.Collection.Set.AbstractSet.HashSet.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx1 {

    public static void main(String[] args) {
        Set<Integer> values = new LinkedHashSet<>();

        System.out.println(values.add(50)); //true
        System.out.println(values.add(30)); //true
        System.out.println(values.add(97)); //true
        System.out.println(values.add(34)); //true
        System.out.println(values.add(null)); //true
        System.out.println(values.add(50)); //false Duplicate elements not allowed
        System.out.println(values.add(null)); //false

        System.out.println(values); //[50, 30, 97, 34, null]  Insertion order is maintained

    }
}
