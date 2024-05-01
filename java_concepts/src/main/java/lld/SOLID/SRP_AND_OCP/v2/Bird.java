package lld.SOLID.SRP_AND_OCP.v2;

public abstract class Bird {
    String name;
    String noOfLegs;
    String noOfWings;
    String color;

    public abstract void makeSound();

    public abstract void fly();
}
