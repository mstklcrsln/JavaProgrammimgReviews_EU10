package week08_10_29_2022;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

                // if we know the elements of array
        int [] arrayName = {1,2,3,4,5,6};

        // if we don't know the elements . We have to define size of array
        // use new keyword
        int [] array = new int[10];
        // put the values in an array
        array [0]= 10;
        array [1]= 10;
        array [2]= 10;
        array [3]= 10;
        array [4]= 259;
        //....

        // print the elements
        System.out.println(Arrays.toString(array)); //[10, 10, 10, 10, 10, 0, 0, 0, 0, 0]
        // to write the element
        System.out.println(array[3]);//10
        System.out.println(array[4]); //259

        //sort method is sorting elements smaller to bigger

        int [] numbers = {2,3,1,10,5,9};
        System.out.println(Arrays.toString(numbers)); //[2, 3, 1, 10, 5, 9]
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); //[1, 2, 3, 5, 9, 10]

        System.out.println("-----------------------------");

        // equals method we can easily compare. Order of elements are important
        int array3 []= {1,2,3,};
        int [] array4 = {2,1,3};
        // they are not equal
        System.out.println(Arrays.equals(array3, array4)); // false
        Arrays.sort(array4);
        System.out.println(Arrays.equals(array3, array4)); // true

    }
}
