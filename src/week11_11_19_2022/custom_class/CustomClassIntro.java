package week11_11_19_2022.custom_class;

public class CustomClassIntro {
    public static void main(String[] args) {
        // how to create an object

        // class name reference = new keyword constructor
        SecondClass secondClass= new SecondClass();
                                    //FirstClass(int a, String b, SecondClass secondClass)
        FirstClass firstObject = new FirstClass(4,"Mesut", secondClass);

        // how to get the attributes
        System.out.println(firstObject.a);
        System.out.println(firstObject.b);

    }
}
