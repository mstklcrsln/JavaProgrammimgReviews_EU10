package week08_10_29_2022;

public class Task3 {
    public static void main(String[] args) {

        String[] sentence = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        // Ctrl+shift+R to change the Srings
        // we need to get word one by one
        /*

;        racecar
         */
        String longestPalindrome = "";
        for (String each : sentence) {
            // i need to check is palindrome or not
            boolean isPalindrome = true;
            for (int i = 0; i < each.length() / 2; i++) {
                //racecar
                char ch1 = each.charAt(i);
                char ch2 = each.charAt(each.length() - i - 1);
                if (ch1 != ch2) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome && each.length() > longestPalindrome.length()) {
                longestPalindrome = each;
            }

        } System.out.println(longestPalindrome); //racecar
    }
}
/*
Task 4 :  For Each - Nested For
ing array. Find the longes
            Longest Palindrome

                Given a Strt Palindrome String in your array.
                    Ex:
                    Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
                    Ex:
                    Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
                    Output: No palindrome
 */