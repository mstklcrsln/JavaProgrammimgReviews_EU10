package week10_11_12_2022;
public class WrapperClasses {

    public static void main(String[] args) {

        String num1 = "123";
        String num2 = "456";
        String res= num1+num2;
        int  res1= Integer.parseInt(num1+num2);
        System.out.println("res1 = " + res1);//res1 = 123456
        System.out.println("res = " + res); //res = 123456
        int  res3= Integer.parseInt(num1);
        int res4= Integer.parseInt(num2);
        System.out.println(res3+res4); //579
    /*
two main reason:
- we will use wrapper in map classes. we can noy use primitive data tpes in the collections so we use wrapper class
 - inside wrapper classes we have some useful methods.

 interview question:
 what is the difference between parseInt and ValueOf?
 if we us valueOf returns an object (wrapper class)
 parseInt returns primitive data types

 1. parse methods: converts String to primitive2. valueOf methods: converts String to wrapper class

 if you want your value inside the collection use valueOf
 */

    int i= Integer.parseInt("123");
/*
what is the difference between autoboxing and unboxing
autoboxing: primitive to object (wrapper class)
unboxing: object (wrapper) to primitive

autoboxing converst primitive into wrapper class object unboxing converst wrapper class into primitive
 */
        int i1= 12;
        Integer integer = i1; // we put primitive to wrapper so autoboxing

        Integer integer2= 12;
        int i2= integer2; // we put the object into the primitive data type ==> unboxing
        System.out.println("-----------------");




}
}