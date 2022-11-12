package week08_10_29_2022;

public class Method {
    public static void main(String[] args) {
        String input = "Java kod yazdıkça öğrenilir";

        System.out.println(reverse(input)); //rilinerğö açkıdzay dok avaJ

    }

    public static String reverse (String input){
        String reversed= "";
        for (int i =input.length()-1; i >=0 ; i--) {
            reversed= reversed+input.charAt(i); // reversed string
        }
    return  reversed;
        }
    }


