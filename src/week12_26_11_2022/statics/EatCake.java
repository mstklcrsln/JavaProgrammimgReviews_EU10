package week12_26_11_2022.statics;

public class EatCake {

    public static int totalSlices =10;

    public void EatCake (int eatSlice){
        totalSlices -= eatSlice;
        System.out.println("Remaining slices :" + totalSlices);
    }
}
