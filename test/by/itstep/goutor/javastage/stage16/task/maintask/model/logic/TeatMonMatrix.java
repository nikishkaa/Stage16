package by.itstep.goutor.javastage.stage16.task.maintask.model.logic;

import by.itstep.goutor.javastage.stage16.task.maintask.util.MatrixUI;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeatMonMatrix {
    public int[][] matrix;

    @Before
    public void initMatrix() {
        matrix = new int[][]{{1, 2, 3},
                {2, 5, 6},
                {3, 8, 9}};
    }

    @After
    public void clearing() {
        matrix = null;
    }

    @Test
    public void testMatrixMonColumn() {
        int expected = 1;

        int actual = MatrixLogic.getMatrixMonColumn(matrix);

        assertEquals(expected, actual);
    }

}
