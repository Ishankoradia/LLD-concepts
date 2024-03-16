package lld.Synchronization.Semaphores.PrintZeroEvenOdd;

import java.util.function.IntConsumer;

public class Client {
    public static void main(String[] args) {
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(10);
        IntConsumer consumer = value -> System.out.println(value);

        Thread thread1 = new Thread(() -> {
            try {
                zeroEvenOdd.zero(consumer);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                zeroEvenOdd.even(consumer);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread thread3 = new Thread(() -> {
            try {
                zeroEvenOdd.odd(consumer);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
