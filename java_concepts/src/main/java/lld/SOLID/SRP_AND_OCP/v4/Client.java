package lld.SOLID.SRP_AND_OCP.v4;

import java.util.ArrayList;
import java.util.List;

import lld.SOLID.SRP_AND_OCP.v4.BirdBehaviours.Flyable;

public class Client {
    public static void main(String[] args) {
        // In v4 solution, we have implemented interfaces to capture a birds behaviours

        /*
         * Using this approach of interfaces i can now solve the class explosion issue
         * faced in v3. I simply have to implement whatever feature the bird is going to
         * have now. For exmaple, penguin doesn't not fly ; so dont implement Flyable
         * interface
         */

        Pigeon pigeon = new Pigeon();
        pigeon.name = "Pig pet name";

        Crow crow = new Crow();
        crow.name = "Crow pet name";

        Penguin penguin = new Penguin();
        penguin.name = "Penguin pet name";

        // I can further do something on a list of birds that can fly
        List<Flyable> flyingBirds = new ArrayList<Flyable>();
    }

}
