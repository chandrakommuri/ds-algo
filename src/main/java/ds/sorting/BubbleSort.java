package ds.sorting;

public class BubbleSort implements Sort<Integer> {
    @Override
    public void sort(Integer[] input) {
        for (int i = 0; i < input.length; i++) {
            boolean swap = false;
            for (int j = 0; j < input.length - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }
    }
}
