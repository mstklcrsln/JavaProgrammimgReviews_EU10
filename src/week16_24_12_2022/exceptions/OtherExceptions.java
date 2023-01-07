package week16_24_12_2022.exceptions;

public class OtherExceptions {

}
/*

Exceptions

Exceptions Topic:
		1. Unchecked vs Checked
		2. try & catch blocks
		3. Multi-catch block
		4. finally block

1- Compile Time Exceptions (Checked )
2- Run Time Exceptions (Unchecked) --> Parent Class RunTimeException

Difference between Error and Exception

1- Exception can be recovered by using the try-catch block. An error cannot be recovered.
2-Exception can be classified into two categories i.e. checked and unchecked. All errors in Java are unchecked.
3- Exception occurs at compile time or run time. Error occurs at run time.


Error

Errors are problems that mainly occur due to the lack of system resources. It cannot be caught or handled. It indicates a serious problem. It occurs at run time. These are always unchecked.

printStackTrace() : prints the full details
getMessage():breefly description






OutOfMemoryError: heap memory is full



Exceptions: unexpected or unwanted events

		Unchecked (unexpected event): occurs during the runtime

					all the RuntimeExceptions are unchecked exceptions

		checked (unwanted event): occurs during the compile time

					all the exceptions that are not RuntimeExceptions are checked exception



Exception handlings:

		1. Try & Catch blocks: used for handling checked and unchecked exceptions

						try{

							exception code

						}catch(ExceptionClass  e){

							e.printStackTrace();

						}


			Multi-catch block: parent exception type can not be placed before the child exception type

			finally block: always gets executed regardless of the exception is being handled or not handled

							to stop the execution of the finally block: Syste.exit(0)

							-------------
package week16_12_24_2022.exceptions;

public class MultiCatchBlock {

    public static void main(String[] args) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }catch (Exception e){

        }

        try {

            System.out.println(9/0);
            Integer.parseInt("123.");
        }catch (ArithmeticException e){
            System.out.println("You got the Arithmetic excepiton");
        }catch (NumberFormatException e){
            System.out.println("you have a problem with your number");
        }catch (Exception e){
            System.out.println("I don't know your exception");
        }




    }
}
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
S

------------
package week16_12_24_2022.exceptions;

public class MultiCatchBlock {

    public static void main(String[] args) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }catch (Exception e){

        }

        try {

            System.out.println(9/0);
            Integer.parseInt("123.");
        }catch (ArithmeticException e){
            System.out.println("You got the Arithmetic excepiton");
        }catch (NumberFormatException e){
            System.out.println("you have a problem with your number");
        }catch (Exception e){
            System.out.println("I don't know your exception");
        }


-----------
package week16_12_24_2022.exceptions;

public class CompileTimeExcepitonsExamples {

    public static void main(String[] args) {
        System.out.println("Adam");
        waitFor(3);
        System.out.println("Ersin");
    //    Thread.sleep(3000);

    }

    private static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {

        }
    }
}

    }
}

 */
