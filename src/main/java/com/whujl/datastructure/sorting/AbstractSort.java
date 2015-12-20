package com.whujl.datastructure.sorting;

import java.util.Arrays;

/**
 * Created by whujl on 15/12/12.
 */
public class AbstractSort<T extends Comparable<T>> {

    protected boolean less(T v, T w){
        return v.compareTo(w) < 0;
    }

    protected void exchange(T[] a, int i, int j){
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    protected boolean isSorted(T[] a){
        for(int i = 1; i < a.length;i++){
            if(less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }

    protected void show(T[] a){
        System.out.println(Arrays.toString(a));
    }

}
