package lld.SOLID.DesignABirdProblem.v3;

public class Pigeon extends FlyBird {
    String name;
    String noOfLegs;
    String noOfWings;
    String color;

    public void makeSound() {
        System.out.println("Making pigeon sound");
    }

    public void fly() {
        System.out.println("Pigeon is flying");
    }

}
