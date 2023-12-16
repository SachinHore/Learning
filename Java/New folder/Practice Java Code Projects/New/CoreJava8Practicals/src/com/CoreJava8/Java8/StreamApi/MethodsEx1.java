package com.CoreJava8.Java8.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class MethodsEx1 {
    public static void main(String[] args) {

        System.out.println("MethodsEx1 start");
        //filter()
        List<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Ankit");
        names.add("Abhinav");
        names.add("Durgesh");
        List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

        //map()
        List<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(4);
        List<Integer> newNumbers = numbers.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(newNumbers);

        //forEach()
        names.stream().forEach(e->{
            System.out.println(e);
        });
        //or using method ref
        newNames.stream().forEach(System.out::println);

        //sort()
        numbers.stream().sorted().forEach(System.out::println);

        //min()
        Integer integer = numbers.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(integer);

        //max()
        Integer integer1 = numbers.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(integer1);


    }
}
