package week11_11_19_2022.custom_class;

public class EmployeeTest {
    public static void main(String[] args) {

        //This the INCORRECT SOLUTION
        // String employee1= "Adam 12345";

        Employee employee = new Employee();
        employee.name= "Adam";
        employee.employeeID= 12345;

        System.out.println(employee.name);  //Adam
        System.out.println(employee.employeeID); //12345
    }
}
