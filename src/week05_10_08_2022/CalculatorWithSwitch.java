package week05_10_08_2022;

import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter first number");
        double number1= scan.nextDouble();

        System.out.println( "Please enter second number");
        double number2 = scan.nextDouble();
        System.out.println("Please enter your operatot ");
        char operator= scan.next().charAt(0); // we used string method
        double result= 0;
        scan.close();

        switch (operator) {
            case '+' :
                result= number1+number2;
                break;
            case '-':
                result= number1-number2;
                break;
            case '/':
                result= number1/number2;
                break;
            case '*' :
                result=number1*number2;
                break;
            default:
                System.out.println("operator is wrong");
                break;
        }
        System.out.println("result = " + result);
    }
    }
