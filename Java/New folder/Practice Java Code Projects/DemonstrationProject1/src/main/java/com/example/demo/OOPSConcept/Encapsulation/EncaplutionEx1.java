package com.example.demo.OOPSConcept.Encapsulation;

class fullyEncapsulatedClass{
    private int a;
    fullyEncapsulatedClass(int a){this.a=a;}
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
}

class writeOnlyClass{
    private int a;
    writeOnlyClass(int a){this.a=a;}
    public void setA(int a) {
        this.a = a;
    }
}


class readOnlyClass{
    private int a;
    readOnlyClass(int a){this.a=a;}
    public int getA() {
        return a;
    }
}


public class EncaplutionEx1 {
    public static void main(String args[]){

        System.out.println("\nEncaplutionEx1 start");

        System.out.println("\nfullyEncapsulatedClass start");
        fullyEncapsulatedClass obj = new fullyEncapsulatedClass(5);
        System.out.println("get value of a "+obj.getA());
        obj.setA(8);
        System.out.println("set value of a=8");
        System.out.println("get value of a "+obj.getA());

        System.out.println("\nwriteOnlyClass start");
        writeOnlyClass obj1 = new writeOnlyClass(5);
        System.out.println("Set value of a=5 using constructor");
        obj1.setA(8);
        System.out.println("set value of a=8");

        System.out.println("\nreadOnlyClass start");
        readOnlyClass obj2 = new readOnlyClass(5);
        System.out.println("Set value of a=5 using constructor");
        System.out.println("get value of a "+obj2.getA());


    }
}
