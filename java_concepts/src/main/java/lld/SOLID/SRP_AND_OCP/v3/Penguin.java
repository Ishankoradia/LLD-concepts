package lld.SOLID.SRP_AND_OCP.v3;

public class Penguin extends NotFlyBird {
    String name;
    String noOfLegs;
    String noOfWings;
    String color;

    public void makeSound() {
        System.out.println("Making penguin sound");
    }

}
