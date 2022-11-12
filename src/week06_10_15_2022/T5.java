package week06_10_15_2022;

public class T5 {
    public static void main(String[] args) {
        String word="Adamm";
        int index=4;

        String temp= "";

        if (index>=word.length() || index<0) {
            System.out.println("this is not valid index");
        } else

        for (int i = 0; i <word.length() ; i++) {
            if (i==index)  // if i equal index i will go to for loop again
                continue;
            // i'm getting caharacter one by one put inside the temp one by one i want to skip when my i equals the index
            // whan continue it will skip that characer and go on
            temp+=word.charAt(i);

        }
        System.out.println(temp); // index 1 ==>Aamm
        // index 2 ==>Admm/
        // / index 3 ==>Adam
        // / index 4 ==>Adam
    }

}
/*
Task 5: Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

input:
 String word="Adamm";
 int index=3;

 output:
 Adam
 */
