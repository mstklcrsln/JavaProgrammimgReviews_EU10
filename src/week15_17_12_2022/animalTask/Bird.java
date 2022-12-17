package week15_17_12_2022.animalTask;

public class Bird extends  Animal {

    @Override
    public void move() {
        super.move(); // when we put this it will write  Animals are moving but how? in the bird object
        System.out.println("Birds are flying");
    }
}
