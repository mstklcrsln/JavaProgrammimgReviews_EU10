package week06_10_15_2022;

public class T4_HowMany {
    public static void main(String[] args) {
        String str="Java is java in everywhere is Java";
        String word="Java";
        int count=0;
        str= str.toLowerCase();

        while (str.contains(word)) { // if sentence contains the given word
           str= str.replaceFirst("java",""); // we delete every single  word
            count++;
        }
        System.out.println(count);
    }
}
/*
Task 4: Given a sentence which is string find word how many times repeats in it.

Hint: use replaceFirst() with while loop

input:
*                                String str="Java is java in everywhere is Java";
*                                String word="Java";
output:3
 */
