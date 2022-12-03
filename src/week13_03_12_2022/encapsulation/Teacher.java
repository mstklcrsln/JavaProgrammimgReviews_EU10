package week13_03_12_2022.encapsulation;

public class Teacher {

    private String name;
    private int ID;

    public Teacher(String name, int ID) {
        if (name.equals("XXXX")){
            System.out.println("Invalid entry!");
        } else {
            this.name = name;
        }
       if (ID<0){
           System.out.println("Invalid entry!");
       } else {
           this.ID = ID;
       }
    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }

    // to set our name or ID we need getter and setter


    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
