package lld.SOLID.DesignABirdProblem.v2;

public class Client {
    public static void main(String[] args) {
        // v2 implements a generic abstract Bird class and then each bird type
        // implements their individual concrete classes by extending the abstract class

        /*
         * This solution is better than v1 because of the following reasons
         * 
         * 1. Single Responsibility Principle, SRP: This v2 solution solves for this.
         * Now the makeSound() method for each bird does just one thing, it no longer
         * checks for type
         * 
         * 2. Open/Close Principle, OCP: The OCP dictates that the codebase should be
         * OPEN to extension but CLOSED for modification. In our v2 implementation, we
         * can easily extend it to accomodate a new bird type like "peacock". We dont
         * have to worry about regression (dont have to worry about already
         * implemented things) and writing test cases on this extended
         * functionality becomes much easier
         * 
         */
        /*
         * Cons of this approach
         * 1. What if a bird doesn't fly which is entirely possible. Since our abstract
         * Bird method forces us to implement the fly() method, we could either keep it
         * empty or make it throw an error "This bird doesn't fly"
         * But this might not be a good solution since parts of code might not know and
         * based on the name of method assume the method is implementing fly(). Will
         * make it less readable.
         * 
         * A bird who can't fly, should ideally not the fly() exposed to it.
         * 
         * 
         */
        Pigeon pigeon = new Pigeon();
        pigeon.name = "Pig pet name";

        Crow crow = new Crow();
        crow.name = "Crow pet name";
    }
}
