package week10_11_12_2022;

import java.util.Arrays;

public class Task10Solution2 {
    public static void main(String[] args) {

        String [] array  = {"123","134","513"};

        // i need to get each string one by one
        for (String each : array) {
            System.out.println(each);
            //i need to get each digit
         String[] eachDigit=   each.split("");
          //  System.out.print(Arrays.toString(eachDigit)); //[1, 2, 3][1, 3, 4][5, 1, 3]
            int total=0;
            for (String s : eachDigit) { // split
               int i= Integer.parseInt(s);
               total+=i;

            }
           System.out.print(Arrays.toString(eachDigit)); //[1, 2, 3][1, 3, 4][5, 1, 3]
            System.out.print(total); //689
        }



        // i can use parsInt method
    }


}
/*
Task 3 : String numbers to sum
                    Given an Array of numbers in String format, add each digit of each element and store into a different Array.
                    Ex:

                    Input:
                    “123”, “34”, “513”

                    Output:
                    [ 6, 8, 9 ]
 */
