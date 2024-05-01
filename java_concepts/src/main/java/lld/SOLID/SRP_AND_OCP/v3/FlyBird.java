package lld.SOLID.SRP_AND_OCP.v3;

public abstract class FlyBird {
    String name;
    String noOfLegs;
    String noOfWings;
    String color;

    public abstract void makeSound();

    public abstract void fly();
}
