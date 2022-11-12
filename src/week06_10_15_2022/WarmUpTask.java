package week06_10_15_2022;

public class WarmUpTask {
    public static void main(String[] args) {
        String word = "code";
        String temp = "";
        for (int i = 1; i <= word.length(); i++) {
            String str = word.substring(0, i);
            temp += str;
            System.out.println(str);

            //c
            //co
            //cod
            //code
        }
    }
}