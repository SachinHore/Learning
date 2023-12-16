package com.example.demo.Java8.SerilizationDeserilization;

import java.io.*;

class Student implements Serializable {
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerDeserEx1 {
    public static void main(String[] args) {
        System.out.println("Serialization start");
        try{
            //Creating the object
            Student s1 =new Student(212,"ravi");
            //Creating stream and writing the object
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("file.txt"));
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("Serialization success");
        }catch(Exception e){System.out.println(e);}

        System.out.println("Deserialization start");
        try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("file.txt"));
            Student s=(Student)in.readObject();
            //printing the data of the serialized object
            System.out.println(s.id+" "+s.name);
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }
}


