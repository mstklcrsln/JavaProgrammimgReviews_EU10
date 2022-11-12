package week05_10_08_2022;

import java.util.Scanner;

public class hbj {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = new Scanner(System.in).next();
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i) + "x");
    }
}}
