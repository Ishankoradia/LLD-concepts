package lld.ConcurrencyParallelism;

public class TableCreator implements Runnable {
    int x;
    
    TableCreator(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            int mul = (this.x) * i;
            System.out.println("Inside thread - " + Thread.currentThread().getName() + " " + this.x + " times " + i + " is " + mul);
        }
    }
    
}
