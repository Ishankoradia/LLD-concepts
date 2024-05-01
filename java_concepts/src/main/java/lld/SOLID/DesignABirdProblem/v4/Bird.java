package lld.SOLID.DesignABirdProblem.v4;

public abstract class Bird {
    String name;
    String noOfLegs;
    String noOfWings;
    String color;

    // put all general/common behaviours of birds here
    void eat() {
        System.out.println("Bird is eating");
    }
}
