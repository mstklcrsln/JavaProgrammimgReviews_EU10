package week05_10_08_2022;

public class StringIntro {
    public static void main(String[] args) {
        /*
        we can create string two different ways
        1- String literal
        2-
         */


        String str= "Wooden" ; // stored inside the string pool
        String str1= "Wooden"; // we will only point the value

        System.out.println(str1==str); // true pointing same adress

        String str2= new String("Wooden");  //new means that we are creating a new object in the heap memory
        String str3= new String("Wooden"); // these are different objects

        System.out.println(str2==str3); // false

    }
}
