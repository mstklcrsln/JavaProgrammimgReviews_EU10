package week03_24_09_2022;

public class SingleAndDoubleAnd {
    public static void main(String[] args) {
        boolean result = false;
        int a=10;
               // false and we have one & sso compiler go on working
        if (result & a++<12) { // if one & a will be 11, if two && a will be 10
            }
        System.out.println(a);

        int b= 10;
        if (result && a++<12) { // if one & a will be 11, if two && a will be 10
        }
        System.out.println(b);


}}
