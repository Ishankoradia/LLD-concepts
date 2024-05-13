package lld.DesignPatterns.StructuralDesignPatterns.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class UserRegistry implements FlyweightRegistry {
    Map<String, UserIntrinsicState> registryMap = new HashMap<>();

    public void addFlyweight(UserIntrinsicState flyweight) {
        registryMap.put(flyweight.getEmail(), flyweight);
    }

    public UserIntrinsicState getFlyweight(String email) {
        return registryMap.get(email);
    }
}
