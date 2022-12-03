package week12_26_11_2022.statics;

public class EatingCake {
    public static void main(String[] args) {

        EatCake eatCake1 = new EatCake();
        //System.out.println(eatCake1); //Remaining slices :8 when we write 2 into the kama's

        eatCake1.EatCake(1); //9
        eatCake1.EatCake(1);//8
        eatCake1.EatCake(1);//7



    }
}
