package week13_03_12_2022.warmup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {
        static ArrayList<Teacher> teachers= new ArrayList<>();
        static String school= "Cydeo";

        //3. create a list of teacher in School class inside the STATIC BLOCK
        static {


        Teacher teacher1=new Teacher("Muhtar","Abc",'M', LocalDate.of(1987,1,1),1L);
        Teacher teacher2=new Teacher("Gurhan","Abc",'M', LocalDate.of(1977,1,1),2L);
        Teacher teacher3=new Teacher("Asyun","Abc",'F', LocalDate.of(1967,1,1),3L);
        Teacher teacher4=new Teacher("Mike","Abc",'M', LocalDate.of(1970,1,1),4L);
        Teacher teacher5=new Teacher("Saim","Abc",'M', LocalDate.of(1989,1,1),5L);
        Teacher teacher6=new Teacher("Asya","Abc",'F', LocalDate.of(1990,1,1),6L);

        teachers.addAll(Arrays.asList(teacher2,teacher1,teacher3, teacher4,teacher6,teacher5));
    }

    public static void main(String[] args) {

        System.out.println(teachers);
        /*
       [Teacher{name='Gurhan', lastName='Abc', gender=M, dateOfBirth=1977-01-01, age=45, ID=2},
       Teacher{name='Muhtar', lastName='Abc', gender=M, dateOfBirth=1987-01-01, age=35, ID=1},
       Teacher{name='Asyun', lastName='Abc', gender=F, dateOfBirth=1967-01-01, age=55, ID=3},
       Teacher{name='Mike', lastName='Abc', gender=M, dateOfBirth=1970-01-01, age=52, ID=4},
       Teacher{name='Asya', lastName='Abc', gender=F, dateOfBirth=1990-01-01, age=32, ID=6},
       Teacher{name='Saim', lastName='Abc', gender=M, dateOfBirth=1989-01-01, age=33, ID=5}]
         */
        ArrayList <Teacher> result = getTeachersNameStartsWith("M");
        System.out.println(result);
        /*
        [Teacher{name='Muhtar', lastName='Abc', gender=M, dateOfBirth=1987-01-01, age=35, ID=1}, Teacher{name='Mike', lastName='Abc', gender=M, dateOfBirth=1970-01-01, age=52, ID=4}]
         */
     ArrayList<Teacher>  female=  getTeachersByGender('F');
        System.out.println(female);
        /*
        [Teacher{name='Asyun', lastName='Abc', gender=F, dateOfBirth=1967-01-01, age=55, ID=3}, Teacher{name='Asya', lastName='Abc', gender=F, dateOfBirth=1990-01-01, age=32, ID=6}]
         */
    }
    private static ArrayList<Teacher> getTeachersByGender(char gender) {
            ArrayList <Teacher> result = new ArrayList<>();
        for (Teacher teacher : teachers) {

            if (teacher.gender==gender){
                result.add(teacher);
            }
        }
    return result;
    }
    private static ArrayList<Teacher> getTeachersNameStartsWith(String prefix) {
            ArrayList<Teacher> result = new ArrayList<>();

            // i need to get teacher one by one
        for (Teacher teacher : teachers) {
            //check the name, if the name is starting with M
                if (teacher.name.startsWith(prefix))
            // we will put that element inside the result
                    result.add(teacher);
    }
        return result;
        }
}
/*
 2. create a class which is School with main method
    3. create a list of teacher in School class inside the STATIC BLOCK
    4. create a method in School class which is returning the list of teachers
    if the last name start with "M"
    5. create a method in School class then you will find the female teachers
    6. create a method in School class then find the teachers age smaller than 30
    7. create a methot in School class then find the teachers born in 1967 year

    summary:
global variables means belongs to current class
local variable means belongs the current block
static methods can use only static variables
for assigning instance variables we will use constructors
for  assigning static  variables we will use static block
 */