package lld.SOLID.DesignABirdProblem.v1;

public class Bird {
    String name;
    String type;
    String noOfLegs;
    String noOfWings;
    String color;

    void fly() {
        System.out.println("Bird is flying");
    }

    void eat() {
        System.out.println("Bird is eating");
    }

    void makeSound() {
        // Sound for different birds might be different
        if (this.type == "CROW") {
            System.out.println("Bird making crow sound");
        } else if (this.type == "PIGEON") {
            System.out.println("Bird making pigeon sound");
        }
    }

    void makeNest() {
        System.out.println("Bird making nest");
    }
}
