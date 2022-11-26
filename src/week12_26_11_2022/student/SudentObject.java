package week12_26_11_2022.student;

public class SudentObject {
    public static void main(String[] args) {

        Student student1= new Student("Mesut");
        Student student2 = new Student("Mesut",41);
        Student student3 = new Student("Mesut",41,2022012515);

        student2.age=25;

        System.out.println(student2); //Student{name='Mesut', age=25, batchNumber=2022012515, school = Cydeo}

    }
}
