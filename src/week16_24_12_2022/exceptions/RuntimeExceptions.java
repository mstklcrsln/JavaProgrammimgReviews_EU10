package week16_24_12_2022.exceptions;

import week15_17_12_2022.empoyee.Employee;

public class RuntimeExceptions {
    static Employee employee;

    public static void main(String[] args) {

        //arithmetic exceptions
        // CTRL+Alt+T button try-catch
        try {
            for (int i = 5; i >=0; i--) { // if we make 0 ==>1 we will fix the bug
                System.out.print(60%i); // java.lang.ArithmeticException:
                }
        } catch (Exception e) {
       //     throw new RuntimeException(e);
            e.getMessage(); //simple message
            // e.printStackTrace(); detailed message
        }


        //null point exception

        // main method is static, we can not reach the instant
        //  methods or variables from the static methods or static blocks
       // System.out.println(employee.salary()); //java.lang.NullPointerException
        //java.lang.NullPointerException means that if you want to use that object firstly you need to initialize that


        //numberFormatException
        String str= "Adam 156561.";
        String s = str.substring(str.indexOf(" ")+1, str.length()-1); //we write str.length()-1); to fix the bug

        System.out.println(Integer.parseInt(s)); //java.lang.NumberFormatException.forInputString

/*

From adam's github

package week16_12_24_2022.exceptions;

import week15_12_17_2022.method_overriding.task3.Employee;

import java.util.SortedMap;

public class RunTimeExceptionsExamples {
    static Employee employee; //we need to make it static in oreder to use inside main method which is static

    public static void main(String[] args) {
//ArithmeticException
        /*
       For Windows ctrl   +alt + T
       For mac     command+alt + T


        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println(60 / i);  //java.lang.ArithmeticException
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()); //Simple Message
            //   e.printStackTrace(); //Detailed message

        }

//NullPointerException
//You can not reach instance variables or methods from the static block or method
        //java.lang.NullPointerException if you want to reach object fields or methods you have  to initialize it. I
        // mean creating object
        try {
            System.out.println(employee.salary());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //NumberFormatException
        String str="Adam 123.";
        String s=str.substring(str.indexOf(" ")+1);
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {

            System.out.println(e.getMessage());
        }

        //ArrayIndexOutOfBoundsException

        int[] array={1,2,3};

        try {
            System.out.println(array[3]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

        //StringIndexOutOfBoundsException
        String name="Adam";

        try {
            //TODO I will find the solution later lets skip it now

            System.out.println(name.charAt(4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //java.lang.StringIndexOutOfBoundsException: String index out of range: 4


        System.out.println("YOU FINISHED YOUR TESTS");

    }
}
 */
    }
}