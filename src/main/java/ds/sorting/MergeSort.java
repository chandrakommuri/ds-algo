package ds.sorting;

import java.util.Arrays;

public class MergeSort implements Sort<Integer> {
    @Override
    public void sort(Integer[] input) {
        if (input.length < 2) {
            return;
        }
        int mid = input.length / 2;
        Integer[] left = Arrays.copyOfRange(input, 0, mid);
        Integer[] right = Arrays.copyOfRange(input, mid, input.length);
        sort(left);
        sort(right);
        merge(input, left, right);
    }

    private void merge(Integer[] input, Integer[] left, Integer[] right) {
        int i = 0;
        int li = 0;
        int ri = 0;
        while (li < left.length && ri < right.length) {
            if (left[li] < right[ri]) {
                input[i++] = left[li++];
            } else {
                input[i++] = right[ri++];
            }
        }

        while (li < left.length) {
            input[i++] = left[li++];
        }

        while (ri < right.length) {
            input[i++] = right[ri++];
        }
    }
}
