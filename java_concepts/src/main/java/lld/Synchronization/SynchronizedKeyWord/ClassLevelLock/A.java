package lld.Synchronization.SynchronizedKeyWord.ClassLevelLock;

public class A implements Runnable {
    synchronized public static void fun1() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Inside fun1 - " + i + " - thread - " + Thread.currentThread().getName());
        }
    }

     void fun2() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Inside fun2 - " + i + " - thread - " + Thread.currentThread().getName());
        }
    }

    void fun3() {
        System.out.println("Inside fun3");
    }

    @Override
    public void run() {
        fun1();
    }
}
