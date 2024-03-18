package by.itstep.goutor.javastage.stage16.task.maintask.model.logic;

public class MatrixLogic {
    public static int getSumElementsBetweenFirstAndSecondPositiveElement(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return -1;
        }

        int sumPosElem = 0;
        int countPosEl = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > 0 && countPosEl == 2) {
                    break;
                } else if (matrix[i][j] < 1 && countPosEl != 0) {
                    sumPosElem += matrix[i][j];
                    countPosEl++;
                }
                countPosEl++;

            }
        }


        return sumPosElem;
    }
}
