package week07_10_22_2022;

public class T3_CountEachWord {
    public static void main(String[] args) {
        String names = "Adam Adam Barry Aysun Aysun";

        String temp ="";
        String result= "";
        for (int i = 0; i < names.length(); i++) {
            char ch= names.charAt(i); //if my character is not equal space i need to put my word to temporery
                if (ch!= ' '){
                    temp+=ch;
                    continue;
                }
            String search= temp;


            int counter = 0;

            String dumy= names;

            while (dumy.contains(search)){
                counter++;
                dumy=dumy.replaceFirst( search, ""); // we are deleting the word
            }
        result+= search+ " " + counter + " ";

            System.out.println(search+ "- "+  counter);
        }
    }
}
/*
--  Task 3: Count each name in sentence.

    input :

  String names = "Adam Adam Barry Aysun Aysun";

    output:

    Adam-2 Barry-1 Aysun-2
 */