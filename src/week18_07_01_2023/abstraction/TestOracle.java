package week18_07_01_2023.abstraction;

public class TestOracle {
    public static void main(String[] args) {

        OracleDatabase oracleDatabase = new OracleDatabase();
        oracleDatabase.save("Adam");
        System.out.println("oracleDatabase.names = " + oracleDatabase.names);
        /*
        I will add Adam inside the database
        oracleDatabase.names = [Adam]
         */

        oracleDatabase.save("Mesut");
        System.out.println("oracleDatabase.names = " + oracleDatabase.names);
        /*
        I will add Mesut inside the database
        oracleDatabase.names = [Adam, Mesut]
         */



        oracleDatabase.delete("Adam");
        System.out.println("oracleDatabase = " + oracleDatabase.names); //oracleDatabase = [Mesut]

        oracleDatabase.update("Mesut", "Ali");
        System.out.println("oracleDatabase.names = " + oracleDatabase.names); //oracleDatabase.names = [Ali]
    }
}
