package lld.DesignPatterns.CreationalDesignPatterns.SingletonClass;

public class Client {
    public static void main(String[] args) {
        /*
         * Check the object ids of db1 & db2, they will be exactly same
         */
        DbConnection db1 = DbConnection.getInstance();
        System.out.println(System.identityHashCode(db1));

        DbConnection db2 = DbConnection.getInstance();
        System.out.println(System.identityHashCode(db2));

        /**
         * Lets check if its thread safe
         */
        Thread t1 = new Thread(db1);
        Thread t2 = new Thread(db2);

        t1.start();
        t2.start();
    }
}
