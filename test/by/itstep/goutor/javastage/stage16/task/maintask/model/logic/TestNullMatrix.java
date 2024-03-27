package by.itstep.goutor.javastage.stage16.task.maintask.model.logic;

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
    public void testSumElementsBetweenFirstAndSecondPositiveElement() {
        int expected = -1;

        int actual = MatrixLogic.getSumElementsBetweenFirstAndSecondPositiveElement(matrix);

        assertEquals(expected, actual);
    }

    @Test
    public void testMatrixMonColumn() {
        int expected = -1;

        int actual = MatrixLogic.getMatrixMonColumn(matrix);

        assertEquals(expected, actual);

    }
}