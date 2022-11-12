package week08_10_29_2022;

public class DishWasher {
    public static void main(String[] args) {

        String str= "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

        String [] words= str.split(", "); // delimeter ==regex
        for (String word: words
             ) {
            if (word.contains(" "))
            System.out.println(word);
            /*
            wooden spoons
            trash can
            dish washer

Process finished with exit code 0

             */
        }


    }
}

/*
Task 2 :    Write a program that accepts string and prints multiple (two word) words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
                 trash can
                  dish washer
 */
