package itstep.learning;

public class MatrixMath {
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        int[][] resultMatrix = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return resultMatrix;
    }

    public static void printMatrices(int[][] matrixA, int[][] matrixB, int[][] resultMatrix) {
        int rows = matrixA.length;

        for (int i = 0; i < rows; i++) {
            printRow(matrixA[i]);
            if (i == rows / 2) {
                System.out.print("  X  ");
            } else {
                System.out.print("     ");
            }
            // Виводимо рядки матриці B
            printRow(matrixB[i]);
            if (i == rows / 2) {
                System.out.print("  =  ");
            } else {
                System.out.print("     ");
            }
            printRow(resultMatrix[i]);
            System.out.println();
        }
    }

    private static void printRow(int[] row) {
        for (int value : row) {
            System.out.print(value + " ");
        }
    }
}
