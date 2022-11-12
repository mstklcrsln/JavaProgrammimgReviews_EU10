package week02_17_09_2022;

public class ConvertMinutesToYearAndDay {
    public static void main(String[] args) {

     /*   int minutes =3456789;
        int hour = minutes/60;
        int day = (hour/24);
        int year = (day/365);
        int remainigDays= day%365;


        System.out.println("3456789 minutes is approximately " + year+ " years and " + remainigDays + " days");

            */
        int givenMinutes= 3456789;
        int howManyMinutesInaYear= (24*60*365);
        int year = givenMinutes/(24*365*60);
        System.out.println(year);
        int reminderMinutes= givenMinutes%howManyMinutesInaYear;
        //int days= reminderMinutes/(24*60);
       // System.out.println("days = "+ days);

        System.out.println(givenMinutes + " is approximately " + year+  " years and " + reminderMinutes);

    }
}

/*
 Input the number of minutes: 3456789
     Expected Output :
     3456789 minutes is approximately 6 years and 210 days
 */