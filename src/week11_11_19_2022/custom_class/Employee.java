package week11_11_19_2022.custom_class;

public class Employee {


    public String name;

    public int employeeID;

    // in order to print attributes we need toString method


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                '}';
    }
}
