package Sort;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    }

    public void testPositive() {
        SelectionSort sort = new SelectionSort();
        int[] arr = {8, 9, 7, 10, 2};
        int[] expected = {2, 7, 8, 9, 10};
        assertArrayEquals(expected, sort.basicSelectionSort(arr));
    }

    public void testNegative() {
        SelectionSort sort = new SelectionSort();
        int[] arr = {-3, -1, -4, -2, -5};
        int[] expected = {-5, -4, -3, -2, -1};
        assertArrayEquals(expected, sort.basicSelectionSort(arr));
    }

    public void testMixed() {
        SelectionSort sort = new SelectionSort();
        int[] arr = {-2, 0, 3, -1, 4};
        int[] expected = {-2, -1, 0, 3, 4};
        assertArrayEquals(expected, sort.basicSelectionSort(arr));
    }

    public void testDuplicates() {
        SelectionSort sort = new SelectionSort();
        int[] arr = {5, -2, 5, -2, 3};
        int[] expected = {-2, -2, 3, 5, 5};
        assertArrayEquals(expected, sort.basicSelectionSort(arr));
    }
}
