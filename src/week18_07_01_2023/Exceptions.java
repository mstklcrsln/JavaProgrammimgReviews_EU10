package week18_07_01_2023;

public class Exceptions {
    public static void main(String[] args) {
        waitFor (3);
        sleep(4);

    }

    private static void waitFor(int seconds ){
       sleep(seconds*1000);
    }
    public static void sleep(int seconds){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
