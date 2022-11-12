package week03_24_09_2022;

public class IntroPreIncrementDecrement {
    public static void main(String[] args) {


        int a= 5;
        System.out.println("a = " + a);

        System.out.println("++a will be = " + ++a); // will be 6  immediately
        System.out.println(a++); // line 11 a will be 6,
        // but line 12 a will be 7
        System.out.println(a); //7
        System.out.println("--a will be = "  + --a); // it was 7 and 7-1=6


        int x=10;
        int number =x++ + 100; //number will be 110
        System.out.println("number = " + number); //x=11
                // int x=11  at the backend or memory we have 11 for x
        int number2 = ++x + 100;
        System.out.println("number2 = " + number2);

    }
}
