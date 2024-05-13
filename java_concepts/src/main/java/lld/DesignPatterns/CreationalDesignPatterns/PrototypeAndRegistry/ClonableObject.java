package lld.DesignPatterns.CreationalDesignPatterns.PrototypeAndRegistry;

// Using Generic helps in using this interface for multiple entities 
// and forcing them to implement the cloneObject method
public interface ClonableObject<T> {
    T cloneObject();
}
