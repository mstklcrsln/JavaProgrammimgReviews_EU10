package week13_03_12_2022.inheritence;

public class Instagram extends MobileApp {

    public Instagram( double version) {
        super("Instagram", version);
    }

    MobileApp instagram = new MobileApp("Instagram", 2.5);


    public void postPhoto(){
        System.out.println("Posting photo");
    }

}
