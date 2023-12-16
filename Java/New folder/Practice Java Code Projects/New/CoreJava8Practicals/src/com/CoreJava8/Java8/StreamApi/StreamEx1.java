package com.CoreJava8.Java8.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(34);
        list1.add(23);
        list1.add(78);
        list1.add(31);
        System.out.println(list1);

        //without stream
        List<Integer> listEven = new ArrayList<>();
        for(Integer i:list1){
            if(i%2==0){
                listEven.add(i);
            }
        }
        System.out.println(listEven);

        //with using stream
        Stream<Integer> stream = list1.stream();
        List<Integer> listEven1=stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(listEven1);
        //or
        List<Integer> listEven2=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(listEven2);





    }
}
