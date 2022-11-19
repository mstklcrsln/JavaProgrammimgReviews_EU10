package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        // how to create an arraylist

        ArrayList<String> cities = new ArrayList<>();
        //ArrayList<String> cities = new ArrayList<>(String);
        // how to add element
        cities.add("London");//returns bolean
        cities.add("Paris");
        cities.add("Yozgat");
        cities.add("Rome");

        // how to print it

        System.out.println(cities); //[London, Paris, Yozgat, Rome]

        cities.add(1,"Corum"); // we add Corum to index 1

        System.out.println(cities); //[London, Corum, Paris, Yozgat, Rome]

        // to get one element we use get method
        System.out.println(cities.get(0)); //London

        // to update one element
        cities.set(2,"Vienna"); // we changed paris with vienna
        System.out.println(cities); //[London, Corum, Vienna, Yozgat, Rome]  set method is returning element which you uptaded

        // how to learn position of the index or index of element
        System.out.println(cities.indexOf("Yozgat")); //3 the index num
        System.out.println(cities.indexOf("Paris")); // we get -1, because there is no Paris
        System.out.println(cities.indexOf("Yo")); // we get -1, because there is no "Yo" in the ArrayList

        // last indexof

        System.out.println(cities.lastIndexOf("Vienna")); //2
        // indexOf and lastIndexOf methods gives the same index if the element is uniq

        cities.add("Vienna");
        System.out.println(cities.indexOf("Vienna"));           //2  start from beginning and returns teh first
        System.out.println(cities.lastIndexOf("Vienna"));      //5 start from last and returns the first from last

        // how to remove one element

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        System.out.println(numbers); //[1, 1, 2, 3, 4, 5, 1]

        System.out.println(numbers.indexOf(1)); // it gives 0 ==> first matching one
        System.out.println(numbers.lastIndexOf(1)); // it gives 6 ==> last matching one


        //how to remove element

       ArrayList<Integer> numbers2= new ArrayList<>();
       //numbers2.addAll(2,3,4,5,6,7);

        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(1);

        System.out.println(numbers2); //[2, 3, 4, 5, 1]

      numbers2.remove(1);           // remove the element in index 1
      System.out.println(numbers2);   // [2, 4, 5, 1] 3 will leave the island.
        Integer b=4;
       // or we can write like this
        //  Integer a= new Integer(4);

        numbers2.remove(b);
        System.out.println(numbers2);  //[2, 5, 1] b ==> 4 removed

        numbers2.remove(new Integer(5));  // we remove 5
        System.out.println(numbers2);       //[2, 1]

        System.out.println("---------------");

        // bulk operations
        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Adam", "Mesut", "Osman", "Seyma", "Falah"));

        // removeIf method
        System.out.println(numbers); //[1, 1, 2, 3, 4, 5, 1]

       /* for (Integer number : numbers) {
            if (number<3){
                numbers.remove(number); // we can not use like this, because for each iteration indexes are changing
            }
        }*/
        numbers.removeIf(k-> k<3);  // if the element is smaller than 3 remove them
        System.out.println(numbers); //[3, 4, 5]


    }
}
