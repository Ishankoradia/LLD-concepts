package lld.SOLID.DesignABirdProblem.v2;

public class Crow extends Bird {
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
