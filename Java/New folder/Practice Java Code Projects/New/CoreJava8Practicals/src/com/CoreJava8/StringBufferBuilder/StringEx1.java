package com.CoreJava8.StringBufferBuilder;

public class StringEx1 {
    public static void main(String[] args) {
        String name = new String("Sachin");  // 2 obj create 1 in Heap and 1 in SCP and name refer to Heap obj
        String name1 = new String("Sachin"); //Now 1 obj create in Heap and name1 ref to it
                                                    // and in SCP already is there so not create

        String name2 = "Sachin"; //1 obj create in SCP and name1 ref to it
        String name3 = "Sachin"; //no new obj create ref to exhistancing one

        name.concat("Hore"); //create Hore in SCP and Sachin Hore no ref in Heap go to GC
        System.out.println(name); //Sachin

        String s = name.concat(" Hore"); // create Sachin Hore in Heap
        System.out.println(s); //Sachin Hore

        System.out.println(name==name1); //false  compare ref/address of both
        System.out.println(name.equals(name1)); //true compare content of both It is in String class

        System.out.println(name2==name3); //true  compare ref/address of both
        System.out.println(name2.equals(name3)); //true compare content of both It is in String class




    }

}
