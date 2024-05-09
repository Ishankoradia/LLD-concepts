package lld.DesignPatterns.SingletonClass;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DbConnection implements Runnable {
    String username;
    String password;
    String db;
    private static DbConnection connInstance = null;
    private static Lock lock = new ReentrantLock();

    private DbConnection() {
        System.out.println("Read config params from env");
        System.out.println("Assign these params to the instance vars");
        username = "db-username";
        password = "db-pass";
        db = "db-name";
        System.out.println("Use it to open connection to database");
    }

    public static DbConnection getInstance() {
        /*
         * Double checking lock
         * Covers an edge case
         */
        if (connInstance == null) {
            lock.lock();
            if (connInstance == null) {
                connInstance = new DbConnection();
            }
            lock.unlock();
        }
        return connInstance;
    }

    @Override
    public void run() {
        DbConnection instance = getInstance();
        System.out.println("Using this instacne for db conn - " + System.identityHashCode(instance));
    }

}
