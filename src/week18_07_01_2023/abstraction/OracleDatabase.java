package week18_07_01_2023.abstraction;

public class OracleDatabase extends  Database {

    @Override
    void save(String name) {
        System.out.println("I will add " + name + " inside the database");
        names.add(name);

    }

    @Override
    void delete(String name) {
        System.out.println("I'll delete "+ name+ " from database");
        names.remove(name);

    }
}
