package week13_03_12_2022.encapsulation;

public class TeacherObject {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("ADam", 25);

        // we can not change the name because we need another teacher so we're using setter we added setter to the Teacher class and we can change the name below line

        teacher.setName("Mesut");
        System.out.println(teacher); //Teacher{name='Mesut', ID=25}
    }

}
