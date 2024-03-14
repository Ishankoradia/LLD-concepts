package lld.Synchronization.SynchronizedKeyWord.ObjLevelLock;

public class Client {
    public static void main(String[] args) {
        A obj1 = new A();

        A obj2 = new A();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // For instance methods the lock is on the object; hence you will see t1 and t2 run concurrently
        t1.start();
        t2.start();
    }
}
