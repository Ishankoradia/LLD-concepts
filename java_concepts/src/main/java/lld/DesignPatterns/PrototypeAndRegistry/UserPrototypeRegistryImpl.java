package lld.DesignPatterns.PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class UserPrototypeRegistryImpl implements UserPrototypeRegistry {

    Map<UserType, User> registryMap = new HashMap<UserType, User>();

    @Override
    public void addPrototype(User user) {
        registryMap.put(user.getType(), user);
    }

    @Override
    public User getPrototype(UserType type) {
        return registryMap.get(type);
    }

    @Override
    public User clone(UserType type) {
        return registryMap.get(type).cloneObject();
    }

}
