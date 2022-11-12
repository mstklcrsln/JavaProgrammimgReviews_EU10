package week10_11_12_2022;

public class VoidAndReturnRecap {
    public static void main(String[] args) {

        add(3,4,5);

        add(3,4);
    }
        // we can use this for debugging
    private static int  add(int i, int i1, int i2) {
        System.out.println(i+i1+i2);
        return i+i1+i2;
    }

    // can we use void method without printing
    // the code works but not give any output it is not goo practice
    private static void add(int i, int i1) {
        int result= i+i1;
    }
}
