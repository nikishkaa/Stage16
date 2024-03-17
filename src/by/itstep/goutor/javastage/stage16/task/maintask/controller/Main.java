package by.itstep.goutor.javastage.stage16.task.maintask.controller;

import by.itstep.goutor.javastage.stage16.task.maintask.util.MatrixConverter;
import by.itstep.goutor.javastage.stage16.task.maintask.util.MatrixInit;
import by.itstep.goutor.javastage.stage16.task.maintask.util.MatrixUI;
import by.itstep.goutor.javastage.stage16.util.view.Printer;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = MatrixInit.initMatrix();

        Printer.print(MatrixConverter.convertMatrix(matrix));
        Printer.print(MatrixUI.getMatrixUI());
    }
}
