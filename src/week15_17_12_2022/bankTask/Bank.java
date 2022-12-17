package week15_17_12_2022.bankTask;

public class Bank {

    private int capital= 1000;

    public int getCapital (){
        return capital;
    }

    public void calculateTheInterest (){
        System.out.println("Interest of the " + getClass().getSimpleName());
        /*
        how we can get the classname?
        getClass().getSimpleName());
        if we create an object from bank class
         if we create an object from Garantibank class

        which objects we're creating than in order to see it we need to get class name
      getClass().getSimpleName()  Indicates which class the object belongs to.


         */
    }


}


/*
Task 1:
Create a Bank class which has a functionality( calculateRateOfInterest(int capital)) that calculates the rate of interest.
However, the rate of interest varies according to banks.
class GarantiBank ----> 8%
class AkBank      ----> 7%
class INGBank     ----> 9%
rate of interest.
 */
