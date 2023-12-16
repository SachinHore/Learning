package com.CoreJava8.StringBufferBuilder;

public class StringBufferEx1 {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Sachin"); //new 1 obj create in Heap
        StringBuffer name1 = new StringBuffer("Sachin"); //new 1 obj create in Heap

        //StringBuffer name2 = "Sachin";  //Not allowed in StringBuffer


        name.append("Hore"); //name= Sachin -> Sachin Hore
        System.out.println(name); //Sachin Hore

        StringBuffer s = name.append(" Hore"); //name= SachinHore -> SachinHore Hore
        System.out.println(s); //SachinHore Hore

        System.out.println(name==name1); //false  compare ref/address of both
        System.out.println(name.equals(name1)); //false compare ref/address of both It is in StringBuffer class





    }

}
