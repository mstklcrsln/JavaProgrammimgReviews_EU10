package week13_03_12_2022.inheritence;

public class Instagram extends MobileApp {

    public Instagram( double version) {
        super("Instagram", version);
    }

    public void postPhoto(){
        System.out.println("Posting photo");
    }

}
