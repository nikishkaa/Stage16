package by.itstep.goutor.javastage.stage16.task.maintask.util;

public class MatrixConverter {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder convertMatrix(int[][] matrix) {
        for (int[] flag : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                BUILDER.append(flag[j]).append(" ");
            }
            BUILDER.append("\n");
        }

        return BUILDER;
    }
}
