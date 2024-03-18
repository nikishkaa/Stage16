package by.itstep.goutor.javastage.stage16.task.maintask.model.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNullLengthMatrix {
    public int[][] matrix;

    @Before
    public void matrixInit() {
        matrix = new int[0][0];
    }

    @After
    public void clearing() {
        matrix = null;
    }

    @Test
    public void testSumElementsBetweenFirstAndSecondPositiveElementByZeroLength() {
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
