package week05_10_08_2022;

public class Tasks {
    public static void main(String[] args) {
        String word= "Hello";

        int  indexOfLastChar= word.length()-1;              //index of o
        int indexOfSecondFromLast = word.length()-2;  // index of L

        char last =word.charAt(indexOfLastChar);
        char beforeLast = word.charAt(indexOfSecondFromLast);

        String lastTwo = " " + beforeLast+last;
        System.out.println(lastTwo+lastTwo+lastTwo);



    // String result= " " + word.lastIndexOf()-1 + word.lastIndexOf(); mine and not work


    }
}
