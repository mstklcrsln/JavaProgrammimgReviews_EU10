package week11_11_19_2022.custom_class;

import java.util.ArrayList;

public class FirstClass {

    public int a;
    // int a;  // we skip public
     String b;
     SecondClass secondClass;
    ArrayList<Integer> arrayList;

    // shortcut for creating constructor
            //for windows: alt+insert

    public FirstClass(int a, String b, SecondClass secondClass) {
        this.a = a;
        this.b = b;
        this.secondClass = secondClass;
    }

    public String toString() {
        return "FirstClass{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", secondClass=" + secondClass +
                '}';
    }
}
