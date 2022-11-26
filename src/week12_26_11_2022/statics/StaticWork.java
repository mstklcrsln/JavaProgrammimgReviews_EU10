package week12_26_11_2022.statics;

public class StaticWork {

    static {
        System.out.println("first static");
    }
    static {
        System.out.println("second static");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }
    /*
    when we run this it will not give anything because we did not run this metod

    public static void methodStatic (){

        System.out.println("void");
    }
     */
    static {
        System.out.println("third static");
    }

    /*
    when we run:

    first static
    second static
    third static
    main method
     */
}
