package week13_03_12_2022.encapsulation;

public class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("XXXX")){
            System.out.println("Wrong input");
        } else {
        this.name = name;}
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.out.println("Invalid");
        } else {
        this.age = age;}
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
