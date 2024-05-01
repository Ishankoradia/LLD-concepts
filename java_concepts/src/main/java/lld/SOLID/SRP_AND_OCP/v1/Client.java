package lld.SOLID.SRP_AND_OCP.v1;

public class Client {
    public static void main(String[] args) {
        // v1 implements a single Bird class to represent attributes and behaviours of a
        // bird

        /*
         * Lets consider the makeSound method. Clearly different birds make different
         * sound
         * Now the makeSound() method needs to accomodate sound of each type of bird.
         * This would be a problem as we have more type of birds being introduced
         * 
         * Cons of this approach
         * 
         * -> Maintainability: It will be difficult to maintain as we introduce more
         * types of bird
         * 
         * -> Readability: At some point of time when we have 50 types of bird, the if
         * else condition in makeSounds() method will become a nightware to read and
         * find something for a particular type of a bird
         * 
         * -> Extensibility: To add sound for a new bird type, i need to go through the
         * big if else and modify it. Consequently, i will also need to update the test
         * cases and worry about regression to make sure the current logic works as it
         * is
         * 
         * -> Reusability/Code Duplication: If i want to reuse the logic of makeSound()
         * of "crow" bird, now i need copy/duplicate the same lines some where else in
         * my codebase. Clearly there is no reuseability
         * 
         */

        /*
         * Building on the cons above, this implementation violates a SOLID principle -
         * "Single Responsibility Principle, SRP". This principle dictates the following
         * 1. Each method/class package should have a single reason to change
         * 2. Each method/class should have precisely a single responsibility
         * 
         * In our case, the makeSound() method is figuring out the type of bird &
         * implementing the sound of that bird. Its handling more than one
         * responsibility
         * 
         * Litmus tests to catch SRP violations
         * 1. Multiple "if-else if" conditions
         * 2. Monster methods - A method which does more than what the name suggests
         * 
         */
        Bird pigeon = new Bird();
        pigeon.type = "PIGEON";
        pigeon.name = "Pig pet name";

        Bird crow = new Bird();
        crow.type = "CROW";
        crow.name = "Crow pet name";
    }
}
