package com.whujl.string;

/**
 * Problem: Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * How many different ways do you know to solve this problem?
 */
public class RotateString {

    public static void rotate(int[] toRotate, int k){

        k = k % toRotate.length;

        if (toRotate == null || k < 0) {
            throw new IllegalArgumentException();
        }

        //length of the first part
        int a = toRotate.length - k;

        reverse(toRotate, 0, a -1);
        reverse(toRotate, a, toRotate.length-1);
        reverse(toRotate, 0 , toRotate.length-1);
    }

    public static void bubbleRotate(int[] toRotate, int k) {
        if (toRotate == null || k < 0) {
            throw new IllegalArgumentException("Array to rotate can't be null");
        }

        for (int i = 0; i < k; i++) {
            for (int j = toRotate.length - 1; j > 0; j--) {
                int temp = toRotate[j];
                toRotate[j] = toRotate[j - 1];
                toRotate[j - 1] = temp;
            }
        }
    }

    static void reverse(int[] toReverse, int left, int right){

        if(left < 0){
            throw new IllegalArgumentException("start number must > 0");
        }

        if(right > toReverse.length){
            throw new IllegalArgumentException("end number must less than array length");
        }

        while(left < right){
            int temp = toReverse[left];
            toReverse[left] = toReverse[right];
            toReverse[right] = temp;
            left++;
            right--;
        }

    }
}
