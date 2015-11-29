package com.whujl.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by whujl on 15/11/29.
 */
public class SearchIn2DMatrixIITest {

    private SearchIn2DMatrixII solution;

    @Before
    public void init() {
        solution = new SearchIn2DMatrixII();
    }

    @Test
    public void testSearchInNullMatrix() throws Exception {
        int[][] testArray = null;
        assertFalse(solution.searchMatrix(testArray, 1));
    }

    @Test
    public void testSearchMatrix() {
        int[][] testArray = new int[][]{
                {-5}
        };
        assertFalse(solution.searchMatrix(testArray, 4));

        testArray = new int[][]{
                {1, 3, 5, 6},
                {2, 4, 7, 8},
                {5, 8, 10, 11},
                {7, 9, 13, 15}
        };
        assertTrue(solution.searchMatrix(testArray, 9));
        assertFalse(solution.searchMatrix(testArray, 19));
    }
}