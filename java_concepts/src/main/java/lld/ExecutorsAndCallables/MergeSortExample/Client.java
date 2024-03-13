package lld.ExecutorsAndCallables.MergeSortExample;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Integer> arr = Arrays.asList(4,3,9,1,0,2);
        ExecutorService es = Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(arr, es);
        Future<List<Integer>> arrFuture = es.submit(sorter);

        List<Integer> ans = arrFuture.get();

        System.out.print(ans);

        es.shutdown();

    }
}
