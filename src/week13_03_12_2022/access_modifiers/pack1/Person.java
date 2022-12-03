package week13_03_12_2022.access_modifiers.pack1;

public class Person {

    public String name;
    // with public we can reach from everywhere

    String lastName; // this is default access modifier
    // with default we can reach inside the same class and the same PACKAGE

    private int ID;
    // with private we can reach only inside the same lass


    protected int age;
    // with private we can reach only inside the same lass, package and sub classes



}
