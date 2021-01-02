package ds.sorting;

public class QuickSort implements Sort<Integer> {
    @Override
    public void sort(Integer[] input) {
        quickSort(input, 0, input.length - 1);
    }

    private void quickSort(Integer[] input, int start, int end) {
        if (start >= end) {
            return;
        }
        int pi = partition(input, start, end);
        quickSort(input, start, pi - 1);
        quickSort(input, pi + 1, end);
    }

    protected int partition(Integer[] input, int start, int end) {
        int pivot = input[end];
        int pi = start;
        for (int i = start; i < end; i++) {
            if (input[i] <= pivot) {
                int temp = input[i];
                input[i] = input[pi];
                input[pi] = temp;
                pi++;
            }
        }
        input[end] = input[pi];
        input[pi] = pivot;
        return pi;
    }
}
