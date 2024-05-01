package lld.SOLID.DesignABirdProblem.v4;

import lld.SOLID.DesignABirdProblem.v4.BirdBehaviours.Flyable;
import lld.SOLID.DesignABirdProblem.v4.BirdBehaviours.Soundable;

public class Pigeon extends Bird implements Flyable, Soundable {
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
