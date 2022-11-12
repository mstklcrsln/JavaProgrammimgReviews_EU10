package week05_10_08_2022;

public class LoopIntro {
    public static void main(String[] args) {

        // if we repeat one action more tham one we can use loop in here will learn for loop

        String str= "0123456";
        str.charAt(0); //  get the first char
        str.charAt(1);  //  get the second char
                                // index <= str.length()-1
        for (int index=0; index<str.length(); index++) {
            System.out.println(str.charAt(index));
        }


        // write the even numbers from 0 to 100

        for (int i=0; i<=100; i++) {
            System.out.println(i);
        }

        // write the even numbers from 0 to 100

        for (int i= 0; i<=100; i+=2){
            System.out.println(i);
        }

        // fori  is the shortcut
        // itar is the second shortcut


        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
        }

        // write the numbers from 100 to 0
        for (int i = 100; i >=0 ; i--) {
            System.out.println(i);
        }






    }
}
