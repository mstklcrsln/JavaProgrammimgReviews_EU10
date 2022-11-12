package week08_10_29_2022;

public class Integer {
    public static void main(String[] args) {


        String st1 = "Java";
        String str2 = "candır";

        System.out.println(concate(st1, str2)); //Java candır
        System.out.println(concate("bu da", "oldu")); //bu da oldu
    }
    public static String concate (String str1,String str2) {
        return str1 + " " + str2;
    }

}
