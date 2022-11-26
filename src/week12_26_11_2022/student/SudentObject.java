package week12_26_11_2022.student;

import java.util.Scanner;

public class SudentObject {
    public static void main(String[] args) {

        Student student1= new Student("Mesut");
        Student student2 = new Student("Mesut",41);
        Student student3 = new Student("Mesut",41,2022012515);

        student2.age=25;

        System.out.println(student2); //Student{name='Mesut', age=25, batchNumber=2022012515, school = Cydeo}

        Student student4= new Student("Osman");
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter " + student4.name +"'s age");
        int age= scan.nextInt();
        student4.age= age;
        //we get the age from user and assign it to our 4th student
        System.out.println(student4); //Student{name='Osman', age=25, batchNumber=0, school = Cydeo}
    }
}
