package lld.DesignPatterns.StructuralDesignPatterns.FlyweightPattern;

public interface FlyweightRegistry {

    void addFlyweight(UserIntrinsicState flyweight);

    UserIntrinsicState getFlyweight(String email);
}