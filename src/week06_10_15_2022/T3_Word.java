package week06_10_15_2022;

public class T3_Word {
    public static void main(String[] args) {
        String str="Java is java in everywhere is Java";
        // harfleri inceleyip boşluğa gelince yazdıracağız
        String temp= ""; // if we have space that means we have one word

        for (int i = 0; i <str.length() ; i++) {

            if (str.charAt(0) != ' ') { // if my character is not space i will put that to my temp value and it will write java
                temp +=str.charAt(i); //
                continue;
            }
            if (str.charAt(i) == ' ') { // we reached end of the word we start new word
                System.out.println(temp);  // we write the result
                /*
                Java
                is
               java
               in
                everywhere
                is
                Java
                 */
                temp="";// we add new empty temp
            }
        }
        System.out.println(temp); // this is the for last word before .(dot).

    }
}
/*
Task 3: Given a sentence which is string and print the each word.
input:

String str="Java is java in everywhere is Java";

output:
Java
is
java
in
.
.
.
 */
