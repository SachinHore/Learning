package com.example.demo.Collection.MapInterface.HashMap;

import java.util.HashMap;
import java.util.Map;

//A Map doesn't allow duplicate keys,but you can have duplicate values.
// HashMap allow null keys and values
//HashMap not maintain insertion order maintains Ascending order of key.
public class HashMapEx1 {
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(null,null);  //Allow null value and key
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
