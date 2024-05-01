package lld.SOLID.DesignABirdProblem.v3;

public class Client {
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon();
        pigeon.name = "Pig pet name";

        Crow crow = new Crow();
        crow.name = "Crow pet name";

        /*
         * Now lets say i want to introduce a bird that doesn't fly for eg penguin
         * I can now just extend the NotFlyBird abstract class to create the Penguin
         * Class
         * 
         * Cons of this approach
         * 1. For one attribute i had to break down into two abstract sub classes
         * "FlyBird", "NotFlyBird".
         * What if we have another attribute that is seen in some birds and not in
         * others. So what if we have "MakeSound" and "NotMakeSound". So now we will a
         * total of 2 x 2 = 4 abstract classes to acocmodate these 2 features. This will
         * be a nightmare if we have N no of features and so we will need 2^N abstract
         * classes - this called "Class Explosion"
         * 
         * There has to be some other way of doing this
         */
        Penguin penguin = new Penguin();
        penguin.name = "Penguin pet name";
    }
}
