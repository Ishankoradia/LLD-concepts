package lld.Synchronization.Semaphores.FizzBuzz;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

class FizzBuzz {
    private int n;
    Semaphore numSema;
    Semaphore fizzSema;
    Semaphore buzzSema;
    Semaphore fizzbuzzSema;

    public FizzBuzz(int n) {
        this.n = n;
        this.numSema = new Semaphore(1);
        this.fizzSema = new Semaphore(0);
        this.buzzSema = new Semaphore(0);
        this.fizzbuzzSema = new Semaphore(0);
    }

    public void releaseNextSema(int k) throws InterruptedException {
        if (k%3 == 0 && k%5 == 0) {
            this.fizzbuzzSema.release();
        } else if (k%3 == 0) {
            this.fizzSema.release();
        } else if (k%5 == 0) {
            this.buzzSema.release();
        } else {
            this.numSema.release();
        }

    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        for(int j=1;j<=n;j++){
            if(j%3 == 0 && j%5 != 0) {
                fizzSema.acquire();
                printFizz.run();
                this.releaseNextSema(j+1);
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        for(int j=1;j<=n;j++){
            if(j%3 != 0 && j%5 == 0) {
                buzzSema.acquire();
                printBuzz.run();
                this.releaseNextSema(j+1);
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for(int j=1;j<=n;j++){
            if(j%3 == 0 && j%5 == 0 ) {
                fizzbuzzSema.acquire();
                printFizzBuzz.run();
                this.releaseNextSema(j+1);
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        for(int j=1;j<=n;j++){
            if(j%3 != 0 && j%5 != 0 ) {
                numSema.acquire();
                printNumber.accept(j);
                this.releaseNextSema(j+1);
            }
        }
    }
}