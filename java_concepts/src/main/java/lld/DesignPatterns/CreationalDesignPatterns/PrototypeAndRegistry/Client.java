package lld.DesignPatterns.CreationalDesignPatterns.PrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {
        UserPrototypeRegistryImpl userRegistry = new UserPrototypeRegistryImpl();

        User user1 = new User(1, "username1", "user@gmail.com", "UserDisplayName", 30, UserType.READER);

        userRegistry.addPrototype(user1);

        System.out.println("DEBUG");

        User copyUser1 = userRegistry.clone(UserType.READER);

        System.out.println("DEBUG");

    }
}
