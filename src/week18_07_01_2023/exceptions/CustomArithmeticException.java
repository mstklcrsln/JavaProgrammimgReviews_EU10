package week18_07_01_2023.exceptions;

public class CustomArithmeticException extends  ArithmeticException {

   // @Override
    public CustomArithmeticException (){ // we send our message to runtime environment compiler
       super("You have an error with divide by zero");
   }
}
