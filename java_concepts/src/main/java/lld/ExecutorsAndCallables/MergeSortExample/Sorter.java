package lld.ExecutorsAndCallables.MergeSortExample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> arr;
    ExecutorService es;

    public Sorter(List<Integer> arr, ExecutorService es) {
        this.arr = arr;
        this.es = es;
    }

    @Override
    public List<Integer> call() throws Exception {
        System.out.println("Calling" + Thread.currentThread().getName());
        if (arr.size() <= 1) {
            return arr;
        }

        int mid = arr.size() / 2;
        List<Integer> leftArray = new ArrayList<Integer>();
        List<Integer> rightArray = new ArrayList<Integer>();

        for (int i = 0; i < mid; i++) {
            leftArray.add(arr.get(i));
        }

        for (int i = mid; i < arr.size(); i++) {
            rightArray.add(arr.get(i));
        }

        Sorter leftArraySorter = new Sorter(leftArray, es);
        Sorter rightArraySorter = new Sorter(rightArray, es);

        Future<List<Integer>> leftArrayFuture = es.submit(leftArraySorter);
        Future<List<Integer>> rightArrayFuture = es.submit(rightArraySorter);

        List<Integer> leftArraySorted = leftArrayFuture.get();
        List<Integer> rightArraySorted = rightArrayFuture.get();


        List<Integer> mergeArray = new ArrayList<Integer>();

        int i = 0;
        int j = 0;
        while (i < leftArraySorted.size() && j < rightArraySorted.size()) {
            if (leftArraySorted.get(i) <= rightArraySorted.get(j)) {
                mergeArray.add(leftArraySorted.get(i));
                i++;
            } else {
                mergeArray.add(rightArraySorted.get(j));
                j++;
            }
        }

        while (i < leftArraySorted.size()) {
            mergeArray.add(leftArraySorted.get(i));
            i++;
        }

        while (j < rightArraySorted.size()) {
            mergeArray.add(rightArraySorted.get(j));
            j++;
        }

        return mergeArray;
    }


}
