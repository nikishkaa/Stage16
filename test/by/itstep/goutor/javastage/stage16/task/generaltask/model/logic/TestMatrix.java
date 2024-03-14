package by.itstep.goutor.javastage.stage16.task.generaltask.model.logic;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class TestMatrix {
    public int[][] matrix;

    @Before
    public void initMatrix() {
        matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
    }

    @After
    public void clearingMatrix() {
        matrix = null;
    }


    @Test
    public void testSumMatrixBoundaryElement() {
        int expected = 102;

        int actual = MatrixLogic.getSumMatrixBoundaryElement(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testSumMatrixBoundaryElementByNull() {
        int[][] nullMatrix = null;
        int expected = Integer.MIN_VALUE;

        int actual = MatrixLogic.getSumMatrixBoundaryElement(nullMatrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testSumMatrixBoundaryElementByZeroLength() {
        int[][] zeroMatrix = new int[0][0];
        int expected = Integer.MIN_VALUE;

        int actual = MatrixLogic.getSumMatrixBoundaryElement(zeroMatrix);

        assertEquals(expected, actual);
    }
}
