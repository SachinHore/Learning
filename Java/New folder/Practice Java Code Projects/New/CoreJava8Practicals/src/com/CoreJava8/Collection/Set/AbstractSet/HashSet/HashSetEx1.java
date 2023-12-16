package com.CoreJava8.Collection.Set.AbstractSet.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1<values> {

    public static void main(String[] args) {
        Set<Integer> values = new HashSet<>();

        System.out.println(values.add(50)); //true
        System.out.println(values.add(30)); //true
        System.out.println(values.add(97)); //true
        System.out.println(values.add(34)); //true
        System.out.println(values.add(null)); //true
        System.out.println(values.add(50)); //false Duplicate elements not allowed
        System.out.println(values.add(null)); //false

        System.out.println(values); //[null, 97, 50, 34, 30]  Insertion order is not maintained

    }
}
