package by.itstep.goutor.javastage.stage16.task.maintask.util;

public class MatrixUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getMatrixUI(int sumPosElem, int numColum) {

        return BUILDER
                .append("Sum elements between first and second posit element ")
                .append(sumPosElem)
                .append("\nMon colum number")
                .append(numColum + 1);
    }
}
