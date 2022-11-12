package week9_11_5_2022;

public class Task5_DifferenceWith21 {

    public static void main(String[] args) {

       int result1= differenceWith21(19);
       int result2= differenceWith21(23);
        System.out.println(result1);
        System.out.println(result2);

    }
    public static int differenceWith21 (int num) {
        //int result=0;
       return (num<21)? 21-num: (num-21)*2;
    }
}

/*
Task 5 :  Write a method that return the absolute difference between n and 21, except return double the absolute difference if n is over 21. (n is int)

    method  parameter : no , or what kibd of data type --- interger
    method return type : void? --- integer


             diff21(19) → 2
             diff21(10) → 11
             diff21(23) → 4
 */
