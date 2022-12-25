package week16_24_12_2022.final_keyword.final_with_variable;

import org.w3c.dom.ls.LSOutput;

public class TestPerson {
    public static void main(String[] args) {


   Person person = new Person("01.02.1981", "MESut");

    // person.birhday= "5616516" when it is private it not allow us
        System.out.println(person); //Person{name='MESut', birhday='01.02.1981'}
        person.setName("Mesut");
        System.out.println(person); //Person{name='Mesut', birhday='01.02.1981'}

    Person person1 = new Person("1516", "Adam");
    person1.setName("Veli");
        System.out.println(person1); //Person{name='Veli', birhday='1516'}
    }
 }