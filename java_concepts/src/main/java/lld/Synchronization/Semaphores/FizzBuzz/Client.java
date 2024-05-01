package lld.Synchronization.Semaphores.FizzBuzz;

import java.util.function.IntConsumer;

public class Client {
    public static void main(String[] args) {
        IntConsumer consumer = value -> System.out.println(value);
        FizzBuzz fizzBuzz = new FizzBuzz(15);

        Thread thread1 = new Thread(() -> {
            try {
                fizzBuzz.fizz(() -> System.out.println("fizz"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });


        Thread thread2 = new Thread(() -> {
            try {
                fizzBuzz.buzz(() -> System.out.println("buzz"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });


        Thread thread3 = new Thread(() -> {
            try {
                fizzBuzz.fizzbuzz(() -> System.out.println("fizzbuzz"));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread thread4 = new Thread(() -> {
            try {
                fizzBuzz.number(consumer);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
