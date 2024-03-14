package lld.Synchronization.SynchronizedKeyWord.ClassLevelLock;

public class Client {
    public static void main(String[] args) {
        A obj1 = new A();

        A obj2 = new A();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Try removing synchronized keyword from method fun1(). Compare both outputs
        // For the synchronized we will see that t1 & t2 run one after the other once the lock is released
        // For a static method the lock is at the class level
        t1.start();
        t2.start();
    }
}
