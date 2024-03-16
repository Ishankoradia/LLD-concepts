package lld.Synchronization.Semaphores.PrintFooBarAlternately;

import java.util.concurrent.Semaphore;

public class FooBar {
    private int n;
    Semaphore fooSema;
    Semaphore barSema;

    public FooBar(int n) {
        this.n = n;
        this.fooSema = new Semaphore(1);
        this.barSema = new Semaphore(0);
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            fooSema.acquire();
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            barSema.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            barSema.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            fooSema.release();
        }
    }
}
