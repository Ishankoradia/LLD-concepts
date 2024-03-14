package lld.Synchronization.AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();

        Lock lock = new ReentrantLock();

        Adder adder = new Adder(v, lock);
        Subtractor subtracter = new Subtractor(v, lock);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> addFuture = es.submit(adder);
        Future<Void> subFuture = es.submit(subtracter);

        addFuture.get();
        subFuture.get();

        System.out.println(v.val);

        es.shutdown();
    }
}
