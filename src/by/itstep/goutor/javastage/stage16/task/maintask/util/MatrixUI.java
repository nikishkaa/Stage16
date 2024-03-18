package by.itstep.goutor.javastage.stage16.task.maintask.util;

public class MatrixUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getMatrixUI(int sumPosElem) {

        return BUILDER
                .append("Sum elements between first and second posit element ")
                .append(sumPosElem);
    }
}
