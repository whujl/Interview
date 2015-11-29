package com.whujl.string;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by whujl on 15/11/29.
 */
public class RotateStringTest {

    @Test(expected = IllegalArgumentException.class)
    public void testReverseInExceptionForLeftArgument() {
        int[] a = new int[]{1, 2};
        RotateString.reverse(a, -1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReverseInExceptionForRightArgument() {
        int[] a = new int[]{1, 2};
        RotateString.reverse(a, 0, 3);
    }

    @Test
    public void testReverse() {
        int[] a = new int[]{1, 3, 5, -3, 6, 7};
        int[] toReverse = Arrays.copyOf(a, a.length);

        RotateString.reverse(toReverse, 0, toReverse.length - 1);

        assertEquals(a.length, toReverse.length);

        for (int i = 0; i < a.length; i++) {
            assertEquals(a[i], toReverse[toReverse.length - 1 - i]);
        }
    }

    @Test
    public void testRotate() throws Exception {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        RotateString.rotate(a, 3);
        System.out.println(Arrays.toString(a));
    }
}