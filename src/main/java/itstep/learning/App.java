package itstep.learning;


public class App
{
    public static void main( String[] args )
    {
        int[][] matrixA = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] matrixB = {
                { 9, 8, 7 },
                { 6, 5, 4 },
                { 3, 2, 1 }
        };

        int[][] resultMatrix = MatrixMath.multiplyMatrices(matrixA, matrixB);

        // Виведення матриць
        MatrixMath.printMatrices(matrixA, matrixB, resultMatrix);
    }
}
