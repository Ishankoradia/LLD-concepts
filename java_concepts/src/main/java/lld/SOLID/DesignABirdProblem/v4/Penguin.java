package lld.SOLID.DesignABirdProblem.v4;

import lld.SOLID.DesignABirdProblem.v4.BirdBehaviours.Danceable;
import lld.SOLID.DesignABirdProblem.v4.BirdBehaviours.Soundable;

public class Penguin extends Bird implements Soundable, Danceable {
    String name;
    String noOfLegs;
    String noOfWings;
    String color;

    public void dance() {
        System.out.println("This bird is dancing");
    }

    public void makeSound() {
        System.out.println("Penguin is making sound");
    }

}
