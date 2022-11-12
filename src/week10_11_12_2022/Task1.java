package week10_11_12_2022;

public class Task1 {

    public static void main(String[] args) {

        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        getSentence(str);


    }

    private static void getSentence(String str) {
        String temp= "";
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
           /* if (('a' <=ch && ch<='z') || ('A' <=ch && ch<='Z')) {
                temp += ch;
                //this is the old method
            }
             if we talk english letters we use isAlphbetic method
            if we are talking other letters we can use isLetter method

            */

           // if (Character.isUpperCase(ch))        first solution
             //   temp+=' ';


            if (Character.isLetter(ch) ||ch== ' '){ // we put  ||ch== ' ' and put spaces
                temp+= ch;
            }


        }
        System.out.println("temp = " + temp); //temp = WelcomeToCoreJava
    }
}
/*
Task 1 : Find the word
                    String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
                    Write a method that returns : Welcome To Core Java
 */