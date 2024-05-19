package lld.JavaBasics.Print1to100using20threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(20);

        for (int i = 1; i <= 100; i++) {
            Task t = new Task(i);
            pool.execute(t);
        }

        pool.shutdown();
    }
}
