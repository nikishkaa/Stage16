package by.itstep.goutor.javastage.stage16.task.generaltask.util;

public class MatrixConverter {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                BUILDER.append(matrix[i][j]).append(" ");
            }
            BUILDER.append("\n");
        }


        return BUILDER;
    }
}
