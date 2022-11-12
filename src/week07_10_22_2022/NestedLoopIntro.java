package week07_10_22_2022;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=5 ; j++) {
                System.out.println("outer loop: " + i+ "inner loop: " + j);
                /*
outer loop: 1inner loop: 1
outer loop: 1inner loop: 2
outer loop: 1inner loop: 3
outer loop: 1inner loop: 4
outer loop: 1inner loop: 5
outer loop: 2inner loop: 1
outer loop: 2inner loop: 2
outer loop: 2inner loop: 3
outer loop: 2inner loop: 4
outer loop: 2inner loop: 5
outer loop: 3inner loop: 1
outer loop: 3inner loop: 2
outer loop: 3inner loop: 3
outer loop: 3inner loop: 4
outer loop: 3inner loop: 5
outer loop: 4inner loop: 1
outer loop: 4inner loop: 2
outer loop: 4inner loop: 3
outer loop: 4inner loop: 4
outer loop: 4inner loop: 5
outer loop: 5inner loop: 1
outer loop: 5inner loop: 2
outer loop: 5inner loop: 3
outer loop: 5inner loop: 4
outer loop: 5inner loop: 5
                 */
            }
        }

        /*
        *******
        ********
        ********
        ********
         */

        int starNumberColumn= 7;
        int starNumberRow= 4;
        for (int i = 1; i <=starNumberRow; i++) { // row number

            for (int j =1; j <=starNumberColumn ; j++) { // column number
                System.out.print("*"); // write 7 times
            }
            System.out.println();
        }
        
        
    }
}
