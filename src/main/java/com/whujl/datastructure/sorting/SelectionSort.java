package com.whujl.datastructure.sorting;

/**
 * Created by whujl on 15/12/12.
 */
public class SelectionSort<T extends Comparable<T>> extends AbstractSort<T> implements Sortable<T> {

    public void sort(T[] toSort) {
        for(int i = 0 ; i < toSort.length; i++){
            int min = i;
            for(int j = i + 1; j < toSort.length; j++){
                if(less(toSort[j], toSort[min])){
                    min = j;
                }
            }
            exchange(toSort, i, min);
        }
    }
}
