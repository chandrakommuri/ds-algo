package ds.sorting;

public class InsertionSort implements Sort<Integer> {
    @Override
    public void sort(Integer[] input) {
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    int temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
