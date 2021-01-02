package ds.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortTest {

    Sort<Integer> sort = new RandomizedQuickSort();

    @Test
    public void testPositiveRandomArray() {
        Integer[] input = {8, 2, 1, 5, 6, 10, 4, 3, 7, 9, 0};
        sort.sort(input);
        Integer[] sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(sorted, input);
    }

    @Test
    public void testNegativeRandomArray() {
        Integer[] input = {0, -8, -2, -1, -5, -6, -10, -4, -3, -7, -9};
        sort.sort(input);
        Integer[] sorted = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0};
        assertArrayEquals(sorted, input);
    }

    @Test
    public void testMixedRandomArray() {
        Integer[] input = {0, -8, 2, -1, 5, 6, 10, -4, -3, 7, -9};
        sort.sort(input);
        Integer[] sorted = {-9, -8, -4, -3, -1, 0, 2, 5, 6, 7, 10};
        assertArrayEquals(sorted, input);
    }

    @Test
    public void testSortedArray() {
        Integer[] input = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sort.sort(input);
        Integer[] sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(sorted, input);
    }

    @Test
    public void testArrayOfSameNumbers() {
        Integer[] input = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        sort.sort(input);
        Integer[] sorted = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        assertArrayEquals(sorted, input);
    }

    @Test
    public void testArrayOfSingleElement() {
        Integer[] input = {1};
        sort.sort(input);
        Integer[] sorted = {1};
        assertArrayEquals(sorted, input);
    }

    @Test
    public void testEmptyArray() {
        Integer[] input = {};
        sort.sort(input);
        Integer[] sorted = {};
        assertArrayEquals(sorted, input);
    }
}