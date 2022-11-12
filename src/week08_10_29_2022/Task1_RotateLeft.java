package week08_10_29_2022;

import java.util.Arrays;

public class Task1_RotateLeft {
    public static void main(String[] args) {
        int[] x = {1,2,3};
      /*
      x[] =x [1];
      x[1]= x [2];
      x[2] = x[0];
       */
        int temp = x[0];
        for (int i = 0; i <x.length-1 ; i++) {
            x[i] = x [i+1];  //it writes error  Index 3 out of bounds for length 3
        }
        x[x.length-1] =temp;

        System.out.println(Arrays.toString(x)); //[2, 3, 1]

      // int[] y = {17,12,10,8};
        //int[] a = {7,0,0};



    }
}

/*
Task 1    : Write a program that accepts an array and prints an array with the elements "rotated left”

        int[] x = {1,2,3};             // = > [2,3,1]
        int[] y = {17,12,10,8};         // = > [12,10,8,17]
        int[] a = {7,0,0};              // = > [0,0,7]
 */