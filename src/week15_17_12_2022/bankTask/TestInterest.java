package week15_17_12_2022.bankTask;

public class TestInterest {

    public static void main(String[] args) {


        Bank bank = new Bank();
        bank.calculateTheInterest(); //Interest of theBank
      //  System.out.println(bank.getCapital());

        Akbank akbank = new Akbank();
        //Interest of the Akbank
        akbank.calculateTheInterest(); //70
        System.out.println("-------------------------");
        GarantiBank garantiBank = new GarantiBank();

        //after enter super to the Garanti class it writes Interest of the GarantiBank
        //Interest of the GarantiBank
        garantiBank.calculateTheInterest(); //80

        IngBank ingBank = new IngBank();
        ingBank.calculateTheInterest();
        //Interest of the IngBank
        //90

    }
}
