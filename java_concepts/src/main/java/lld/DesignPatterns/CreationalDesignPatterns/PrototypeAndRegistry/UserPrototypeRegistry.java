package lld.DesignPatterns.CreationalDesignPatterns.PrototypeAndRegistry;

public interface UserPrototypeRegistry {
    void addPrototype(User user);

    User getPrototype(UserType type);

    User clone(UserType type);
}
