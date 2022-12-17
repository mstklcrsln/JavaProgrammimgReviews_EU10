package week15_17_12_2022.bankTask;

public class IngBank extends Bank {

    @Override
    public void calculateTheInterest() {
        System.out.println(getCapital()*9/100);
    }
}
