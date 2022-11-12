package week08_10_29_2022;

import java.util.Arrays;

public class ForEachLoopIntro {
    public static void main(String[] args) {

    int [] numbers = {1,2,3,4,5}; // if the values are important we can use for each loop
        for ( int each : numbers
             ) {
            System.out.print(each); //12345
        }
        System.out.println();

        /*
         where we use which loop
         if our loop needs to start from the last element to solve the problem : we can not use for each loop
         */
            String str1= "Adam";
            char [] letters = str1.toCharArray();
        for (char letter : letters
             ) {
            System.out.print(letter);
                    }
        System.out.println(Arrays.toString(letters)); //[A, d, a, m]


        System.out.println("---------------------");
        //split  (regex)
        String sentence = "Java is a good language.";

        String [] words = sentence.split(" "); // we seperate the word sing comma and space

        for (String word : words) {  // we can seperate words in a sentence
            System.out.print(word); //Javaisagoodlanguage
            System.out.println();
           System.out.print(word.replace(".",""));
        }








   }
}


