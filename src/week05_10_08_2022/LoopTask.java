package week05_10_08_2022;

public class LoopTask {
    public static void main(String[] args) {

        String password= "Cydeo";
        char encryptWith= 'x';
        String encryptedPassword= "";
        for (int i = 0; i < password.length(); i++) {
            encryptedPassword+= "" + password.charAt(i)+ encryptWith; // Cxyxdxexox
        }
        System.out.println(encryptedPassword);
    }
}
/*
Task 9: Given a string password. Encrypt with "x" a given password and print.

    Hint: do with for loop

     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox

     System.out.println("Enter a word: ");
        String word = new Scanner(System.in).next();
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i) + "x");
 */