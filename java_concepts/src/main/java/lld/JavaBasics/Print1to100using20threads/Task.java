package lld.JavaBasics.Print1to100using20threads;

public class Task implements Runnable {
    int i;

    Task(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName() + " Num: " + i);
    }
}
