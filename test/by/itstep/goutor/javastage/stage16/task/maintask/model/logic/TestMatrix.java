package by.itstep.goutor.javastage.stage16.task.maintask.model.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMatrix {
    public int[][] matrix;

    @Before
    public void initMatrix() {
        matrix = new int[][]{{-1, 2, -3},
                {-4, 5, 6},
                {7, 8, 9}};
    }

    @After
    public void clearing() {
        matrix = null;
    }

    @Test
    public void testSumElementsBetweenFirstAndSecondPositiveElement() {
        int expected = -7;

        int actual = MatrixLogic.getSumElementsBetweenFirstAndSecondPositiveElement(matrix);

        assertEquals(expected, actual);
    }

}
