package lld.Synchronization.AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    Value v;
    Lock lock;

    Subtractor(Value v, Lock lock) {
        this.v = v;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        // One way
        // for (int i = 0; i < 1000; i++) {
        //     lock.lock();
        //     this.v.val -= i;
        //     lock.unlock();
        // }

        for (int i = 0; i < 1000; i++) {
            synchronized(this.v) {
                this.v.val -= i;
            }
        }

        return null;
    }
}
