package week06_10_15_2022;

public class T2_CountWords {
    public static void main(String[] args) {

        String str="Java is java in everywhere is Java";

        int counter=0;
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == ' ') {
              //  if (str.charAt(i) != ' ') { // finds the letters
            counter++;
        }
            } System.out.println(counter+1); // we find how many spaces in the sentence and add 1 and find the words numbers 7
}}

/*
Task 2: Given a sentence which is string and count the words in it.

input:

  String str="Java is java in everywhere is Java";

  output:7
 */
