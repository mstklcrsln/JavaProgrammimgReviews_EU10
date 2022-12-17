package week15_17_12_2022.empoyee;

public class TestSalary {
    public static void main(String[] args) {

        Employee employee = new Employee();
        System.out.println(employee.salary()); //10000

        Manager manager= new Manager();
        System.out.println(manager.salary()); //30000

        Clerk clerk = new Clerk();
        System.out.println(clerk.salary()); //20000
    }
}
