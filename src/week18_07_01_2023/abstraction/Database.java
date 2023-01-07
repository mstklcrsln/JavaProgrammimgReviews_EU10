package week18_07_01_2023.abstraction;

import java.util.ArrayList;

public abstract class Database {


    protected ArrayList <String > names = new ArrayList<>();

    // rules for database
    abstract void save(String name);

    //rule
    abstract void delete (String name);






}
