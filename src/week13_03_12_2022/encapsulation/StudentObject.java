package week13_03_12_2022.encapsulation;

public class StudentObject {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Adam");
        student.setAge(52);

        System.out.println(student); //Student{name='xxxxxxxxx', age=-200}
        // the solution is encapsulation we put private to the variables in the Student class
        //after this part we changed code

        System.out.println(student);
        /*
        Student{name='null', age=0}
Student{name='null', age=0} after this part we changed code
         */

        System.out.println(student.getName()); //Adam
        System.out.println(student.getAge()); //52
    }
}
