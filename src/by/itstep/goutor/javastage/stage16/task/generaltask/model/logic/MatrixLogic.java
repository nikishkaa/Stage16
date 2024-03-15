package by.itstep.goutor.javastage.stage16.task.generaltask.model.logic;

public class MatrixLogic {
    public static int getSumMatrixBoundaryElement(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return Integer.MIN_VALUE;
        }

        int matrixBoundarySum = 0;

        int firstLineSum = getSumFirstLine(matrix[0]);

        return matrixBoundarySum;
    }

    private static int getSumFirstLine(int[] matrix) {
        int firstLineSum = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            firstLineSum += matrix[i][];
        }


        System.out.println("first line sum " + firstLineSum);
        return firstLineSum;
    }
}
