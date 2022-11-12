package week03_24_09_2022;

public class CharacterIdentity {
    public static void main(String[] args) {

        /*char givenChar = '2';

        if (givenChar>=65&& givenChar<=90|| givenChar>=97 && givenChar<=122) {
            System.out.println("Alphabetic Character");
        } else if (givenChar>=48 && givenChar <=57) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
*/
        System.out.println("-----------------------------------------");
        // Muhtar made below

        char ch= 'd';

        if (ch>= '0' && ch <= '9') {
        System.out.println("Digit");
        }
        else if ((ch>='A' && ch <='Z') || (ch>='a' && ch<='z')){

        System.out.println("Alphabetic");}
        else {
        System.out.println("Special Character");}



    }
}