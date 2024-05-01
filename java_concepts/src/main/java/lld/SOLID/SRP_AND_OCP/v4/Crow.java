package lld.SOLID.SRP_AND_OCP.v4;

import lld.SOLID.SRP_AND_OCP.v4.BirdBehaviours.Flyable;
import lld.SOLID.SRP_AND_OCP.v4.BirdBehaviours.Soundable;

public class Crow extends Bird implements Flyable, Soundable {
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
