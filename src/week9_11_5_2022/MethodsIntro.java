package week9_11_5_2022;

public class MethodsIntro {
    public static void main(String[] args) {
            // print hello 5 times
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        // print hello 5 times
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        // print hello 5 times
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");


        System.out.println("------------------");
        printHello5Times();

        System.out.println("----------------------");
        // to add two number
        int result= sum(5,6); //11


        multiplyWith2AndPrint(result); //22


        System.out.println(sum(25, 40));


    }

    private static void multiplyWith2AndPrint(int result) {
        System.out.println(result*2);
    }

    private static int sum(int number1, int number2) {
        return number1+number2;
    }


    public static void printHello5Times () {
        for (int i = 0; i <=5 ; i++) {
            System.out.println("Hello");
        }
    }

}
