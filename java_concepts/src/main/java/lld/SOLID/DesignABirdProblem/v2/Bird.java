package lld.SOLID.DesignABirdProblem.v2;

public abstract class Bird {
    String name;
    String noOfLegs;
    String noOfWings;
    String color;

    public abstract void makeSound();

    public abstract void fly();
}
