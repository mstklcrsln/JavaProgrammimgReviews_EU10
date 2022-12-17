package week15_17_12_2022.empoyee;

public class Clerk extends Employee {

    @Override
    public int salary() {
        return super.salary()+10000;
    }
}
/*
3- Create a class Clerk which has
-- salary() method returns the baseSalary+10000
 */