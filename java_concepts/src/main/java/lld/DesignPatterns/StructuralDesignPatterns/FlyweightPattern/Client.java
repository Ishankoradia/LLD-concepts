package lld.DesignPatterns.StructuralDesignPatterns.FlyweightPattern;

public class Client {
    public static void main(String[] args) {
        Byte[] photo = new Byte[10];
        UserIntrinsicState user = new UserIntrinsicState();
        user.setAge(20);
        user.setEmail("test@gmail.com");
        user.setGender("male");
        user.setName("testuser");
        user.setPhoneNumber("9999999999");
        user.setPhoto(photo);

        // set this intrinsic user in registry
        FlyweightRegistry registry = new UserRegistry();
        registry.addFlyweight(user);

        // somewhere in some other client code base where user enters games
        FlyweightRegistry registry2 = new UserRegistry();
        String email = "test@gmail.com";
        UserIntrinsicState sameUser = registry2.getFlyweight(email);

        // Game1
        UserExtrinsicState userGame1 = new UserExtrinsicState(Colour.BLACK, 1, sameUser);

        // Game2
        UserExtrinsicState userGame2 = new UserExtrinsicState(Colour.WHITE, 2, sameUser);

        if (userGame1.getUser() == userGame2.getUser()) {
            System.out.println("Flyweight working correctly");
        } else {
            System.out.println("Something went wrong");
        }
    }
}
