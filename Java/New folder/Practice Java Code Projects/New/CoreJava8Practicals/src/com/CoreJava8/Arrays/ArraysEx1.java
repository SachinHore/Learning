package com.CoreJava8.Arrays;

import java.util.Arrays;

public class ArraysEx1 {

    public static void main(String[] args) {
        System.out.println(" main");

        //1D array
        int[] a1 = new int[3];
        int[] a3 = new int[4];
        int a4[] = new int[4];

        a1[0] = 1;
        a1[1] = 2;
        a1[2] = 3;
        //a[3] = 4; //array Index out of bound

        //2D array
        int[][] a = new int[2][];
        a[0] = new int[2];
        a[1] = new int[3];

        a[0][0] = 1;
        a[0][1] = 2;
        //a[0][2] = 1;  //array Index out of bound
        a[1][0] = 3;
        a[1][1] = 1;
        a[1][2] = 1;
        //a[1][3] = 1; //array Index out of bound
        //a[2][] = 1; //array Index out of bound

    }
}


