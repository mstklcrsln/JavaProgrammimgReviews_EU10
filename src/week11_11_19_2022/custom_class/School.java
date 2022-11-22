package week11_11_19_2022.custom_class;

import java.time.LocalDate;
import java.util.ArrayList;

public class School {
    public static void main(String[] args) {
        ArrayList <Student> students= new ArrayList<>();

        Student student1 = new Student("Osman", 'M','A', LocalDate.of(2000,1,1),111);
        Student student2 = new Student("Ali", 'M','A', LocalDate.of(2001,2,10),113);
        Student student3 = new Student("Veli", 'M','A', LocalDate.of(2002,3,11),115);
        Student student4 = new Student("Mesut", 'M','A', LocalDate.of(2003,4,9),117);
        Student student5 = new Student("Aygun", 'M','A', LocalDate.of(2005,5,12),119);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

            ArrayList<Student> result= getStudentsNameStartsWithA(students);

        System.out.println(result); //starting names with A
        // [Student{name='Ali', gender=M, grade=A, dateOfBirth=2001-02-10, age=21, studentID=113}, Student{name='Aygun', gender=M, grade=A, dateOfBirth=2005-05-12, age=17, studentID=119}]


    }
    public static ArrayList<Student> getStudentsNameStartsWithA(ArrayList<Student> students) {
    ArrayList<Student> result= new ArrayList<>();
        for (Student eachStudent : students) {
            if(eachStudent.name.startsWith("A")){
                result.add(eachStudent);
            }
        }
        return result;
    }
}



