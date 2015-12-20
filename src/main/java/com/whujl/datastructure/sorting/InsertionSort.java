package com.whujl.datastructure.sorting;

import java.util.Arrays;

/**
 * Created by whujl on 15/12/12.
 */
public class InsertionSort<T extends Comparable<T>> extends AbstractSort<T> implements Sortable<T> {

    public void sort(T[] toSort) {
        for (int i = 1; i < toSort.length; i++) {
            for (int j = i; j > 0 && less(toSort[j], toSort[j - 1]); j--) {
                exchange(toSort, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 3, 7, 5};
        Arrays.parallelSort(a);
    }
}
