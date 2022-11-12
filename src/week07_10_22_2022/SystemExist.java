package week07_10_22_2022;

public class SystemExist {
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {
            if (i==3){
               System.exit(0); // it prints only 012

            } System.out.println(i);

        }
        System.out.println("after break");  // it wil print after break


        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                if (j==3){
                    break; // it breaks only inner loop

                }         System.out.println(i+ " " + j);

            }

        }
        System.out.println("after break");
    }
}
