package lld.Synchronization.Semaphores.PrintFooBarAlternately;

public class Client {
    public static void main(String[] args) {
        FooBar fooBar = new FooBar(10);

        Thread thread1 = new Thread(() -> {
            try {
                fooBar.foo(() -> System.out.println("foo"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                fooBar.bar(() -> System.out.println("bar"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        thread1.start();
        thread2.start();
        
    }
}
