package lld.ConcurrencyParallelism;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        /**
         * Concurrency and parallelism are related terms but not the same.
         * 1) Concurrent programming means more than one process is in execution at the same time, 
         * but only one of them might be making progress.
         * 
         * 2) Parallel programming means more than one process is in execution as well as making progress at the same time.
         * 
         * The example below demonstrates concurrency.
         * 
         * The program below is a simple example of concurrency. 
         * Lets say we want to print the multiplication table of number from 1 to n (n is input by the user).
         * We can do this by creating a thread for each number and then printing the table of that number
         */


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i=1; i<=n; i++) {
            TableCreator table_i = new TableCreator(i);

            Thread t = new Thread(table_i);
            t.start();
        }
        
    }
}
