package week15_17_12_2022.bankTask;

public class Akbank extends Bank {

    @Override
    public void calculateTheInterest() {
        super.calculateTheInterest();
        System.out.println(getCapital()*7/100);
    }
}
