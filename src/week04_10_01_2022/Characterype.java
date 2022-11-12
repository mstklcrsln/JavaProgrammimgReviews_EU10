package week04_10_01_2022;

public class Characterype {
    public static void main(String[] args) {
        char ch = ' ';
        boolean isUpperCase = ch >= 'A' && ch <= 'Z';
        boolean isLoverCase = ch >= 'a' && ch <= 'z';
        //   boolean isNotAlphabetic = !(ch>='A' && ch<='Z') ||  (ch>='a' && ch<='z')
        boolean isNotAlphabetic = !(isUpperCase) || (isLoverCase);
        // !isUpperCase &&! isLoverrCase
        String result ="";


        if (isUpperCase){
            System.out.println(ch+ " is an UpperCase character");
        }else if (isLoverCase) {
            System.out.println(ch+ " is a LowerCase character");
        }else {
            System.out.println(ch+ " is not an alphabetic character");
        }}}


        /*if (isUpperCase) {
            System.out.println(ch + " is an UperCase character");
            if (isLoverrCase) {
                System.out.println(ch + " is an LoverCase character");
            } if (isNotAlphabetic) {
                System.out.println(ch + " is not a character");
            }
        }
        System.out.println("result = " + result);
    }
}


    /*    if (isUpperCase) {
            System.out.println( ch+ " is an UperCase character");
        } else if (isLoverrCase){
            System.out.println( ch+ " is an LowerCase character");
        } else {
            System.out.println( ch+ " is not Alphabetic character");
        }





    }
}
/*
Given a character, the task is to check whether the given character is
in upper case, lower case, or non-alphabetic         character

                            Input: ch = 'A'
                            Output: A is an UpperCase character

                            Input: ch = 'a'
                            Output: a is an LowerCase character

                            Input: ch = '0'
                            Output: 0 is not an aplhabetic character
 */