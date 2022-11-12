package week05_10_08_2022;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        // if we want to get specific character we need to use charAt method
        String str= "Adam";
                          //0123

        System.out.println(str.charAt(0)) ; // we want to see first character of String
        System.out.println(str.charAt(2));  // we want to see 3.nd character

        //if we want to get the length of string we use length method
            System.out.println(str.length()); //4

            // get the last character
        int lengtOfTheString = str.length();
        int indexOfLastChar= lengtOfTheString-1;
        System.out.println(str.charAt(indexOfLastChar)); //m

        //in order to make letter lower case
        System.out.println(str.toLowerCase());  //adam

        //in order to make letter upper case
        System.out.println(str.toUpperCase()); // ADAM


        // in order to remove spaces before and after your String trim
        String str1= "     adam      ";

        System.out.println(str1.trim());
        System.out.println(str1); //      adam       because String is immutable IMMUTABLE

        // if we want to get index of char or string we need to use indexof method IMPORTANT

        String number = "0123456"; //  get the index of 3
        System.out.println(number.indexOf('3')); // result is 3.  it gives of the index of given character
        // for get the index of 34
        System.out.println( number.indexOf("34"));  // it gives the index of FIRST CHARACTER
        // get the index of 14
        System.out.println(number.indexOf("14")); // -1 it will return -1 that means that there is not no 14 in that string


        String sentence= "Java is a programming language";

        System.out.println(sentence.indexOf('p'));  //10
        System.out.println(sentence.indexOf("programming")); // it gives 10. the first matching character
        System.out.println(sentence.indexOf(" programming")); // it gives 9. the first matching character

        // lastIndexOf  starts from right

        String sentence1 = "Java is Java";
        System.out.println(sentence1.indexOf("Java")); // it gives the first Java's index number
        System.out.println(sentence1.lastIndexOf("Java")); // it starts from last/right  and it gives the second Java's index number 8


        // if we want to replace some parts of the String we use replace() method

        String sentence3 = "Java is a hard programming language";

        System.out.println(sentence3.replace("hard", "easy")); //Java is a easy programming language

        System.out.println(sentence3.replace("hard", "fun")); //Java is a fun programming language
        System.out.println("---------------------------------------------");

        String sentence4 = "java is not same with java";
        System.out.println(sentence4.replaceFirst("java", "C#")); // C# is not same with java

            // if we want to get some part of the string we need to use substring

        System.out.println("---------------------------------------");

            String subs= "Cydeo";  // to get last 3 caharacters
                                //01234
        System.out.println(subs.substring(1, 4 )); // yde

        // get the Cy from string
        System.out.println(subs.substring(0, 2)); // Cy


        // get the "deo" from subs variable
        System.out.println(subs.substring(2));  // gives after 2 index to the end   deo

        // getthe "ydeo" from the variable
        System.out.println(subs.substring(1));              //ydeo

        System.out.println("---------------------------------------");

        // if we want to repeat (multiply) one word means we need to use repeat methot IMPORTANT

        String str4= "Adam";
        System.out.println(str4.repeat(4));  // AdamAdamAdamAdam


        // if we want to check our String is empty or not we need to use isEmpty method

        String emptyWord= " ";
        System.out.println(emptyWord.isEmpty()); // false   "" is true
        // is empty method is checking length

        System.out.println("----------------------------");
        // if we want to check our String is blank  or not we need to use isBlank method

        String blankWord= "     ";  // we will use in login parts of the sites
        System.out.println(blankWord.isBlank()); // it is true

        // if we want to compare two String values with exact matching we can use equals method
        // if we want to compare two String values withcase insensitive  (loercase or uuppercase) we can use equals method

        String str6= "Word";

        String str7= "word";

        System.out.println(str6.equals(str7)); //false   upper case sensitivy
        System.out.println(str6.equalsIgnoreCase(str7)); //true


        System.out.println("-------------------------------------");

        // startWith method is using for checking the string is STARTING with given char sequence or not
        // startWith method is using for checking the string is ENDING with given char sequence or not





    }
        }
