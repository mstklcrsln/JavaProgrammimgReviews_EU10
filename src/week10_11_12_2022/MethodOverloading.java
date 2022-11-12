package week10_11_12_2022;

public class MethodOverloading {
    public static void main(String[] args) {

        // i want to add two numbers
        int i= 23;
        double d= 24.5;
        float f= 25.5f;

        sum(i,d); // same method names, different parameters
        sum (d,f);
        sum (i,i,i);


    }
        //  if we change  number of parameter we can implement method overloading
            // if we use diffreent order for parameter also we ca implement the method overloading
            // if we use different parameter data types we can implement the method overloading
            // if we change only return type compiler gives error
    private static void sum(int i, int i1, int i2) {
    }

    private static void sum(double d, float f) {
    }

    private static void sum(int i, double d) {
    }

  /*  private static double sum(int i, double d) {
   return ;
    }
    we can not use method overloading only changing return type

   */
}
