package by.itstep.goutor.javastage.stage16.task.generaltask.controller;

import by.itstep.goutor.javastage.stage16.task.generaltask.model.logic.MatrixLogic;
import by.itstep.goutor.javastage.stage16.task.generaltask.util.MatrixConverter;
import by.itstep.goutor.javastage.stage16.task.generaltask.util.MatrixInit;
import by.itstep.goutor.javastage.stage16.task.generaltask.util.MatrixUI;
import by.itstep.goutor.javastage.stage16.util.view.Printer;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = MatrixInit.initMatrix();

        int matrixBoundarySum = MatrixLogic.getSumMatrixBoundaryElement(matrix);


        StringBuilder startMatrix = MatrixConverter.getMatrix(matrix);

        Printer.print(startMatrix);
        Printer.print(MatrixUI.getMatrixUI(matrixBoundarySum));
    }
}
