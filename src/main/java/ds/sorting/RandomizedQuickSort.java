package ds.sorting;

import java.util.Random;

public class RandomizedQuickSort extends QuickSort {
    @Override
    protected int partition(Integer[] input, int start, int end) {
        Random random = new Random();
        int pi = random.ints(start, end).findFirst().getAsInt();
        int temp = input[pi];
        input[pi] = input[end];
        input[end] = temp;
        return super.partition(input, start, end);
    }
}
