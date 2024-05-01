package lld.SOLID.SRP_AND_OCP.v3;

public class Crow extends FlyBird {
    String name;
    String noOfLegs;
    String noOfWings;
    String color;

    public void makeSound() {
        System.out.println("Making crow sound");
    }

    public void fly() {
        System.out.println("Crow is flying");
    }

}
