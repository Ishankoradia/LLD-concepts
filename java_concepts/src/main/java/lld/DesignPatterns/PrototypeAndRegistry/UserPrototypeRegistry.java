package lld.DesignPatterns.PrototypeAndRegistry;

public interface UserPrototypeRegistry {
    void addPrototype(User user);

    User getPrototype(UserType type);

    User clone(UserType type);
}
