package by.itstep.goutor.javastage.stage16.task.generaltask.model.logic;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import static org.junit.Assert.assertEquals;

public class TestMagicSquare {
    public static int[][] matrix;

    @Before
    public void init() {
        matrix = new int[][]{
                {13, 8, 12, 1},
                {2, 11, 7, 14},
                {3, 10, 6, 15},
                {16, 5, 9, 4}

        };
    }

    @After
    public void clearing() {
        matrix = null;
    }

    @Test
    public void testMagicSquare() {
        boolean expected = true;

        boolean actual = MatrixLogic.getMagicSquare(matrix);

        assertEquals(expected, actual);
    }

}
