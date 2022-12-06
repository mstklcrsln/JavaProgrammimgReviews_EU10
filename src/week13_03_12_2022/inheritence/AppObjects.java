package week13_03_12_2022.inheritence;

public class AppObjects {
    public static void main(String[] args) {

       Instagram instagram = new Instagram( 2.5);
        System.out.println(instagram); //MobileApp{name='Instagram', version=2.5}

        instagram.postPhoto(); //Posting photo
       instagram.useTheApp(25); //The user is using Instagram application for 25 minutes


        Discord discord = new Discord("Discort",4.5);

        System.out.println(discord); //MobileApp{name='Discord', version=4.5}
        discord.useTheApp(2); //The user is using Discord application for 2 minutes

    }

}
