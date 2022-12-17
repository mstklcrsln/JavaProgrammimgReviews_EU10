package week15_17_12_2022.empoyee;

public class Manager extends Employee {

    @Override
    public int salary() {
      return   super.salary()+ 20000;
      // we get the salary with super keyword and add 20000 to the salary and return it
    }
}
/*
2- Create a class Manager which has
-- salary() method returns the baseSalary+20000
 */