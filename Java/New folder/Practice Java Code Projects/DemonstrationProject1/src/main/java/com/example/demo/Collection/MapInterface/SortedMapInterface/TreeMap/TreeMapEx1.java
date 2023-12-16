package com.example.demo.Collection.MapInterface.SortedMapInterface.TreeMap;

import java.util.Map;
import java.util.TreeMap;

//A Map doesn't allow duplicate keys, but you can have duplicate values.
// TreeMap doesn't allow any null key can have multiple null values.
//TreeMap doesnot maintain insertion order maintains ascending order of key.
//Homogenious Data store
public class TreeMapEx1 {
    public static void main(String args[]){
        Map<Integer,String> map=new TreeMap<>();//Creating TreeMap
        map.put(2,null);  //null value and key not allow
        map.put(3,"Apple");
        map.put(1,"Banana");
        map.put(4,"Grapes");
        System.out.println("Before duplicate key"+map);
        map.put(1,"Grapes"); //trying duplicate key override value
        System.out.println("After duplicate key"+map);

        map.putIfAbsent(3,"Abc");
        map.putIfAbsent(5,"pqr");
        System.out.println("After putIfAbsent"+map);


        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
