package by.itstep.goutor.javastage.stage16.task.generaltask.model.logic;

public class MatrixLogic {
    public static final int SECOND_LINE = 1;

    public static int getSumMatrixBoundaryElement(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return Integer.MIN_VALUE;
        }

        int firstLineSum = getSumFirstLine(matrix[0]);
        int lastLineSum = getSumLastLine(matrix[matrix.length - 1]);
        int firstColumnSum = getFirstColumnSum(matrix);
        int lastColumnSum = getLastColumnSum(matrix);

        return firstLineSum + lastLineSum + firstColumnSum + lastColumnSum;
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

    private static int getFirstColumnSum(int[][] matrix) {
        int firstColumnSum = 0;

        for (int i = SECOND_LINE; i < matrix.length - 1; i++) {
            firstColumnSum += matrix[i][0];
        }

        return firstColumnSum;
    }

    private static int getLastColumnSum(int[][] matrix) {
        int lastColumnSum = 0;

        for (int i = SECOND_LINE; i < matrix.length - 1; i++) {
            lastColumnSum += matrix[i][matrix.length - 1];
        }

        return lastColumnSum;
    }


}
