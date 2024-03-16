package by.itstep.goutor.javastage.stage16.task.generaltask.model.logic;

public class MatrixLogic {
    public static int getSumMatrixBoundaryElement(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return Integer.MIN_VALUE;
        }

        int matrixBoundarySum = 0;

        int[] matrixLastLine = matrix[matrix.length - 1];

        int firstLineSum = getSumFirstLine(matrix[0]);
        int lastLineSum = getSumLastLine(matrix[matrix.length - 1]);

        return matrixBoundarySum;
    }

    private static int getSumFirstLine(int[] matrixFirstLine) {
        int firstLineSum = 0;

        for (int i : matrixFirstLine) {
            firstLineSum += i;
        }

        return firstLineSum;
    }

    private static int getSumLastLine(int[] matrixLastLine) {
        int lastLineSum = 0;

        for (int i : matrixLastLine) {
            lastLineSum += i;
        }

        return lastLineSum;
    }
}
