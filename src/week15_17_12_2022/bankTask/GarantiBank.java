package week15_17_12_2022.bankTask;

public class GarantiBank extends Bank {
    @Override
    public void calculateTheInterest() {
        System.out.println(getCapital()*8/1000);
    }
}
