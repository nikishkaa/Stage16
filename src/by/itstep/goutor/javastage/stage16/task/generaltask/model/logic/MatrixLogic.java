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


    public static boolean getMagicSquare(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        if (!getSquareMatrix(matrix)) {
            return false;
        }

        boolean magicSquare = false;

        int sumMagicLine = getSimilarMatrixLine(matrix);
        int sumMagicColumn = getSimilarMatrixColum(matrix);
        int mainDiagonalSum = getSumMainDiagonal(matrix);
        int sameDiagonalSum = getSumSideDiagonal(matrix);

        boolean similarDiagonal = getSimilarDiagonal(mainDiagonalSum, sameDiagonalSum);
        boolean columLineSimSum = getSimilarColumnLineSum(sumMagicLine, sumMagicColumn);


        if (similarDiagonal && columLineSimSum) {
            magicSquare = true;
        }


        return magicSquare;
    }


    //O(N)
    private static int getSumFirstLine(int[] matrixFirstLine) {
        int firstLineSum = 0;

        for (int i : matrixFirstLine) {
            firstLineSum += i;
        }

        return firstLineSum;
    }

    //O(N)
    private static int getSumLastLine(int[] matrixLastLine) {
        int lastLineSum = 0;

        for (int i : matrixLastLine) {
            lastLineSum += i;
        }

        return lastLineSum;
    }

    //O(N)
    private static int getFirstColumnSum(int[][] matrix) {
        int firstColumnSum = 0;

        for (int i = SECOND_LINE; i < matrix.length - 1; i++) {
            firstColumnSum += matrix[i][0];
        }

        return firstColumnSum;
    }

    //O(N)
    private static int getLastColumnSum(int[][] matrix) {
        int lastColumnSum = 0;

        for (int i = SECOND_LINE; i < matrix.length - 1; i++) {
            lastColumnSum += matrix[i][matrix.length - 1];
        }

        return lastColumnSum;
    }

    //O(N)
    private static boolean getSquareMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix.length) {
                return false;
            }

        }
        return true;
    }

    //O(N^2)
    private static int getSimilarMatrixLine(int[][] matrix) {
        int sum = getSumFirstLine(matrix[0]);

        for (int i = 1; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != sum) {
                return Integer.MIN_VALUE;
            }
        }

        return sum;
    }

    //O(N^2)
    private static int getSimilarMatrixColum(int[][] matrix) {
        int sum = getColumSum(matrix);

        for (int i = 1; i < matrix[0].length; i++) {
            int columnSum = 0;
            for (int[] elem : matrix) {
                columnSum += elem[i];
            }
            if (columnSum != sum) {
                return Integer.MIN_VALUE;
            }
        }


        return sum;
    }

    //O(N)
    private static int getColumSum(int[][] matrix) {
        int sum = 0;

        for (int[] elem : matrix) {
            sum += elem[0];
        }

        return sum;
    }

    //O(N^2)
    private static int getSumMainDiagonal(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == i) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    //O(N)
    private static int getSumSideDiagonal(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - 1 - i];
        }

        return sum;
    }

    //O(N)
    private static boolean getSimilarDiagonal(int mainDiagonalSum,
                                              int sameDiagonalSum) {

        return mainDiagonalSum == sameDiagonalSum;
    }

    //O(N)
    private static boolean getSimilarColumnLineSum(int sumMagicLine,
                                                   int sumMagicColum) {
        return sumMagicLine == sumMagicColum;
    }
}
