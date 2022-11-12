package week10_11_12_2022;

import java.util.Arrays;

public class Task11HidePasswords {
    public static void main(String[] args) {

        String [] password= {"one", "hi", "hold"};
            String [] result = hidePassword(password);
        System.out.println(Arrays.toString(result));
    }

    public static String[] hidePassword(String[] password) {
        String [] results = new String[password.length];

        int index=0; // we create this for increase in order
        for (String element : password) {
            // convert letter to stars

            String result = convertLetterToStar(element);
            results[index++]= result;
        }
            return results;
    }
// this method will get the string it will convert into the stars
    public static String convertLetterToStar(String s) {
        String temp ="";
      for (int i= 0; i< s.length(); i++) {
          temp += "*";
      }
      return temp;
        }
    }
/*
Task 4 : Hide Passwords

                    Given an array of passwords (String). Hide each password as a star (*) and show the hidden password
                    Ex:
                    Input:
                    {"one", "hi", "hold}
                    Output:
                    [ ***, **, **** ]
 */