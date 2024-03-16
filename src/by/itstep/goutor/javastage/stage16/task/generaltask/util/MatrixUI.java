package by.itstep.goutor.javastage.stage16.task.generaltask.util;

public class MatrixUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getMatrixUI(int matrixBoundarySum) {

        return BUILDER.append("Sum Boundary matrix elements ").append(matrixBoundarySum);
    }
}
