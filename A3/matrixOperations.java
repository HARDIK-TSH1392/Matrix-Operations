package A3;

import java.util.ArrayList;

public interface matrixOperations {

    public void changeElements(int[][] matrix1);

    public void addMatrices(int [][] matrix1, int [][] matrix2, ArrayList<Matrix> matrices);

    public void subtractMatrices(int [][] matrix1, int [][] matrix2, ArrayList<Matrix> matrices);

    public void multiplyMatrices(int [][] matrix1, int [][] matrix2, ArrayList<Matrix> matrices);

    public void divideMatrices(int [][] matrix1, int divisor, ArrayList<Matrix> matrices);

    public void elementWiseOperations(int [][] matrix1, int [][] matrix2, String operation);

    public int[][] transposeMatrix(int [][] matrix1);

    public void inverseMatrix(int [][] matrix1);

    public void rowMean(int [][] matrix1);

    public void columnMean(int [][] matrix1);

    public void matrixMean(int [][] matrix1);

    public int determinant(int [][] matrix1);

    public void singletonAsScalar(int [][] matrix1, int [][] matrix2, Main use, ArrayList<Matrix> matrices);

    public void symmNonSymmOperations(int [][] matrix1);

    public void eigenValue(int [][] matrix1);

    public void solveLinearEquations(int [][] matrix1, int [][] matrix2);

    public void retrieveAll(ArrayList<Matrix> matrixList, String option, int start, int end);
}
