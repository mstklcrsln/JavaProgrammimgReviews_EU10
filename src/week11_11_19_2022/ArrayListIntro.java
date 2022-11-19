package week11_11_19_2022;

import java.util.ArrayList;

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
        System.out.println(cities); //[London, Corum, Vienna, Yozgat, Rome]


    }
}
