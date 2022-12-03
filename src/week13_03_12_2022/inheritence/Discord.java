package week13_03_12_2022.inheritence;

public class Discord extends MobileApp {

    public Discord(String name, double version) {
        super("Discord", version);
    }

    public void chat (){
        System.out.println("The user is chatting");
    }

}
