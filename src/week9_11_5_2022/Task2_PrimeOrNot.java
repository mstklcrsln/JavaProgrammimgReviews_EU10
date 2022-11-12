package week9_11_5_2022;

public class Task2_PrimeOrNot {

    public static void main(String[] args) {

    boolean result = isPrime(173); //true
        System.out.println(result); //true

    }

    private static boolean isPrime(int number) {
        boolean isPrimeNumber= true;
        if (number<2) {
            return false;// this is saying: if number is smaller than 2 it means that this number can not be prime number. so we return false return false

        }
        for (int i = 2; i <number ; i++) {
            if (number%i==0) {
                isPrimeNumber=false;
                break; // if number %2 is 0 so number is not prime. so we don't need to go on.

              /*  isPrimeNumber=false;
                return isPrimeNumber */
            }
        }
        return isPrimeNumber;
    }


}
/*
Task 2 :   Write a method that can check if a number is prime or not

                Note : Prime numbers are special numbers, greater than 1, that have exactly two factors, themselves and 1
 */