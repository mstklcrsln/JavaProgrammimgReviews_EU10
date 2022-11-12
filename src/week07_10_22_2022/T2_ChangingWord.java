package week07_10_22_2022;

public class T2_ChangingWord {
    public static void main(String[] args) {

    String message= "I love cats! I have a cat named Coco. My cat's very smart!";
    // "I love dogs! I have a dog named Coco. My dog's very smart!";  using indexOf and substring.
      //  System.out.println("i love " + str.replaceFirst("cats","dogs"+ str.re);

        String searched= "cat";
        String changed= "dog";

        String result ="";

       // String result1= message.replace(searched, changed); this is the easy way

        int indexOfFirstCat= message.indexOf(searched); // index of first cat
        int endOfWord= indexOfFirstCat+ searched.length();
        System.out.println(indexOfFirstCat);  //7
        System.out.println(endOfWord); //10
        
        message= message.substring(0,indexOfFirstCat)+ changed+message.substring(endOfWord);
        System.out.println("message = " + message); //message = I love dogs! I have a cat named Coco. My cat's very smart!

        // we will do this process for the other cats. we do same actions for the all cats

        while (message.contains(searched)) {
          indexOfFirstCat= message.indexOf(searched); // index of first cat
         endOfWord= indexOfFirstCat+ searched.length();
            message= message.substring(0,indexOfFirstCat)+ changed+message.substring(endOfWord);
        }

        System.out.println("message = " + message); //I love dogs! I have a dog named Coco. My dog's very smart!
        // we need to check the message contains cat or not
     //   while (message.contains(searched)) {

        }
    }




/*
-- Task 2:  Write a program that replaces every occurrence of "cat" in the message with "dog",
 using indexOf and substring.

  input:

  String message = "I love cats! I have a cat named Coco. My cat's very smart!";

  output:

 "I love dogs! I have a dog named Coco. My dog's very smart!";
 */
