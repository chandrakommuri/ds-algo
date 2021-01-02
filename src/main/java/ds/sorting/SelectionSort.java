package ds.sorting;

public class SelectionSort implements Sort<Integer> {
    @Override
    public void sort(Integer[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[minPos] > input[j]) {
                    minPos = j;
                }
            }
            int temp = input[i];
            input[i] = input[minPos];
            input[minPos] = temp;
        }
    }
}
