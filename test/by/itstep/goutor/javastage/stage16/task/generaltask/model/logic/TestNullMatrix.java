package by.itstep.goutor.javastage.stage16.task.generaltask.model.logic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNullMatrix {
    public int[][] matrix;

    @Before
    public void matrixInit() {
        matrix = null;
    }

    @Test
    public void testSumMatrixBoundaryElementByNull() {
        int expected = Integer.MIN_VALUE;

        int actual = MatrixLogic.getSumMatrixBoundaryElement(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testMagicSquare() {
        boolean expected = false;

        boolean actual = MatrixLogic.getMagicSquare(matrix);

        assertEquals(expected, actual);
    }
}
