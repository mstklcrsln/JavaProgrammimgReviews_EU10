package week09_11_5_2022;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int [] firstArray = {1,2,3};
        int [] secondArray = {4,5,6};
        int [] thirdArray = {7,8,9};

        int [][] twoDimensionalArray = {
                {1,2,3,}, // first Array
                {4,5,6},// second arry
                {7,8,9,10} // third array
        };
      //  int [][] array2D = {{}, {}, {} }; // also we can use like this
        int [][] array2D = {firstArray, secondArray, thirdArray };


        System.out.println(twoDimensionalArray[0][1]); // in order to reach 2 first we need go to first array by using index of array which s 0, than i need to go to that element by using index of element which is 1.

        // to find 9
        System.out.println(twoDimensionalArray[2][2]); //9

        System.out.println("----------------------------");

        // to reach the all elements in the array
                            // taht mean is how many arrayyouu have in that two dimensional array 3. searching array one by one
        for (int i = 0; i < twoDimensionalArray.length ; i++) { // in order to go to array one by one
            System.out.println(i+1+ ". array");
            for (int j = 0; j < twoDimensionalArray.length ; j++) { // this is for finding element inside the inner array
                System.out.print(twoDimensionalArray[i][j]); //123456789
                //  Arrays.toString(twoDimensionalArray[i][j]) ; // we will go to that array one by one. if we wnt to go each element we need another for loop
            }
            System.out.println("==============");
          /*
          1. array
123==============
2. array
456==============
3. array
789==============
           */
        }


    }


}
