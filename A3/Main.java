package A3;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main implements matrixOperations {
    public static void main(String[] args) {
        ArrayList<Matrix> matrices = new ArrayList<>();
        Scanner sc1 = new Scanner(System.in);
        int optionNumber = 1;
        int rows;
        int columns;
        String name;
        String matrixTypeName;
        Main use = new Main();
//        int [][] matrix = new int[rows][columns];

        while(optionNumber != 0){

            System.out.println("0- EXIT");
            System.out.println("1- INPUT MATRIX");
            System.out.println("2- CREATE MATRIX OF SELECTED TYPE");
            System.out.println("3- CHANGE ELEMENTS");
            System.out.println("4- DISPLAY MATRIX TYPE OF A MATRIX");
            System.out.println("5- ADD MATRIX");
            System.out.println("6- SUB MATRIX");
            System.out.println("7- MULTIPLY MATRIX");
            System.out.println("8- DIVIDE MATRIX");
            System.out.println("9- PERFORM ELEMENT WISE OPERATIONS");
            System.out.println("10- TRANSPOSE MATRIX");
            System.out.println("11- INVERSE MATRIX");
            System.out.println("12- ROW WISE MEAN");
            System.out.println("13- COLUMN WISE MEAN");
            System.out.println("14- MATRIX MEAN");
            System.out.println("15- CALCULATE DETERMINANT");
            System.out.println("16- USE SINGLETON MATRIX AS SCALAR");
            System.out.println("17- PERFORM A + A' ");
            System.out.println("18- CALCULATE EIGEN VALUE");
            System.out.println("19- SOLVE LINEAR EQUATIONS");
            System.out.println("20- DISPLAY MATRIX OF REQUESTED TYPE");

            optionNumber = sc1.nextInt();

            if(optionNumber == 1){

                System.out.println("Enter name for matrix: ");
                name = sc1.next();
                System.out.println("Input number of rows: ");
                rows = sc1.nextInt();
                System.out.println("Input number of columns: ");
                columns = sc1.nextInt();
//                System.out.println(name + rows + columns);

                int [][] matrix = new int[rows][columns];
                System.out.println("Enter elements of matrix");
                for(int i = 0; i < rows; i++){
                    for(int j = 0; j < columns; j++){
                        System.out.println("Enter element: ");
                        matrix[i][j] = sc1.nextInt();
                    }
                }
//                System.out.println(matrix.length);
                System.out.println(name + " = ");
                printMatrix(matrix);

                Matrix m = new Matrix(name, rows, columns, matrix);
                matrices.add(m);
            }
            else if(optionNumber == 2){
                System.out.println("Enter name for matrix: ");
                name = sc1.next();
                System.out.println("Input number of rows: ");
                rows = sc1.nextInt();
                System.out.println("Input number of columns: ");
                columns = sc1.nextInt();
                System.out.println("Enter type of matrix you want to create: ");
                matrixTypeName = sc1.next();

                Matrix m1 = new Matrix(name, rows, columns, matrixTypeName);
                printMatrix(m1.matrix);
                matrices.add(m1);

            }
            else if(optionNumber == 3){
                System.out.println("Enter name of matrix: ");
                String input1 = sc1.next();
                int [][] matrix1 = new int[0][0];

                for(int i = 0; i < matrices.size(); i++){
                    if(input1.equals(matrices.get(i).name)){
                        matrix1 = matrices.get(i).matrix;
                    }
                }
                use.changeElements(matrix1);
            }
            else if(optionNumber == 4){
                String inputName;
                System.out.println("Enter the matrix whose type you want: ");
                inputName = sc1.next();

                System.out.println("\n");
                for(int i = 0; i < matrices.size(); i++){
                    if(inputName.equals(matrices.get(i).name)){
                        for(int j = 0; j < matrices.get(i).matrixType.size(); j++){
                            System.out.println(matrices.get(i).matrixType.get(j));
//                            System.out.println("\n");
                        }
                    }
                    System.out.println("\n");
                }

            }
            else if(optionNumber == 5){
                System.out.println("Enter name of first matrix: ");
                String input1 = sc1.next();
                System.out.println("Enter name of second matrix: ");
                String input2 = sc1.next();
                int [][] matrix1 = new int[0][0];
                int [][] matrix2 = new int[0][0];

                for(int i = 0; i < matrices.size(); i++){
                    if(input1.equals(matrices.get(i).name)){
                        matrix1 = matrices.get(i).matrix;
                    }
                }
                for(int j = 0; j < matrices.size(); j++){
                    if(input2.equals(matrices.get(j).name)){
                        matrix2 = matrices.get(j).matrix;
                    }
                }
                use.addMatrices(matrix1, matrix2, matrices);
            }
            else if(optionNumber == 6){
                System.out.println("Enter name of first matrix: ");
                String input1 = sc1.next();
                System.out.println("Enter name of second matrix: ");
                String input2 = sc1.next();
                int [][] matrix1 = new int[0][0];
                int [][] matrix2 = new int[0][0];

                for(int i = 0; i < matrices.size(); i++){
                    if(input1.equals(matrices.get(i).name)){
                        matrix1 = matrices.get(i).matrix;
                    }
                }
                for(int j = 0; j < matrices.size(); j++){
                    if(input2.equals(matrices.get(j).name)){
                        matrix2 = matrices.get(j).matrix;
                    }
                }
                use.subtractMatrices(matrix1, matrix2, matrices);
            }
            else if(optionNumber == 7){
                System.out.println("Enter name of first matrix: ");
                String input1 = sc1.next();
                System.out.println("Enter name of second matrix: ");
                String input2 = sc1.next();
                int [][] matrix1 = new int[0][0];
                int [][] matrix2 = new int[0][0];

                for(int i = 0; i < matrices.size(); i++){
                    if(input1.equals(matrices.get(i).name)){
                        matrix1 = matrices.get(i).matrix;
                    }
                }
                for(int j = 0; j < matrices.size(); j++){
                    if(input2.equals(matrices.get(j).name)){
                        matrix2 = matrices.get(j).matrix;
                    }
                }
                use.multiplyMatrices(matrix1, matrix2, matrices);
            }
            else if(optionNumber == 8){
                System.out.println("Enter name of first matrix: ");
                String input1 = sc1.next();
                System.out.println("Enter number to divide with: ");
                int input2 = sc1.nextInt();
                int [][] matrix1 = new int[0][0];

                for(int i = 0; i < matrices.size(); i++){
                    if(input1.equals(matrices.get(i).name)){
                        matrix1 = matrices.get(i).matrix;
                    }
                }
                use.divideMatrices(matrix1, input2, matrices);
            }
            else if(optionNumber == 9){
                String operation;
                System.out.println("Enter name of first matrix: ");
                String input1 = sc1.next();
                System.out.println("Enter name of second matrix: ");
                String input2 = sc1.next();
                System.out.println("Enter the operand sign: ");
                operation = sc1.next();
                int [][] matrix1 = new int[0][0];
                int [][] matrix2 = new int[0][0];

                for(int i = 0; i < matrices.size(); i++){
                    if(input1.equals(matrices.get(i).name)){
                        matrix1 = matrices.get(i).matrix;
                    }
                }
                for(int j = 0; j < matrices.size(); j++){
                    if(input2.equals(matrices.get(j).name)){
                        matrix2 = matrices.get(j).matrix;
                    }
                    use.elementWiseOperations(matrix1, matrix2, operation);
                }
            }
            else if(optionNumber == 10){
                System.out.println("Enter name of matrix whose transpose you want to find: ");
                String input1 = sc1.next();
                int [][] matrix1 = new int[0][0];
                for(int i = 0; i < matrices.size(); i++){
                    if(input1.equals(matrices.get(i).name)){
                        matrix1 = matrices.get(i).matrix;
                    }
                }
                use.transposeMatrix(matrix1);

            }
            else if(optionNumber == 1){

            }
            else if(optionNumber == 12){
                System.out.println("Enter name of matrix for row mean: ");
                String input1 = sc1.next();
                int [][] matrix1 = new int[0][0];
                for(int i = 0; i < matrices.size(); i++){
                    if(input1.equals(matrices.get(i).name)){
                        matrix1 = matrices.get(i).matrix;
                    }
                }
                use.rowMean(matrix1);
            }
            else if(optionNumber == 13){
                System.out.println("Enter name of matrix for column mean: ");
                String input1 = sc1.next();
                int [][] matrix1 = new int[0][0];
                for(int i = 0; i < matrices.size(); i++){
                    if(input1.equals(matrices.get(i).name)){
                        matrix1 = matrices.get(i).matrix;
                    }
                }
                use.columnMean(matrix1);
            }
            else if(optionNumber == 14){
                System.out.println("Enter name of matrix for matrix mean: ");
                String input1 = sc1.next();
                int [][] matrix1 = new int[0][0];
                for(int i = 0; i < matrices.size(); i++){
                    if(input1.equals(matrices.get(i).name)){
                        matrix1 = matrices.get(i).matrix;
                    }
                }
                use.matrixMean(matrix1);
            }
            else if(optionNumber == 15){
                System.out.println("Enter name of matrix for calculating determinant: ");
                String input1 = sc1.next();
                int [][] matrix1 = new int[0][0];
                for(int i = 0; i < matrices.size(); i++){
                    if(input1.equals(matrices.get(i).name)){
                        matrix1 = matrices.get(i).matrix;
                    }
                }
                use.determinant(matrix1);
            }
            else if(optionNumber == 16){
                String input;
                String input1 = sc1.next();
                String input2 = sc1.next();
                int [][] matrix1 = new int[0][0];
                int [][] matrix2 = new int[0][0];
                System.out.println("Use singleton matrix in matrix operations. Do you allow using singleton matrices as a scalar value?");
                input = sc1.next();
                if(input.equals("yes")){
                    System.out.println("Enter name of matrix: ");
                    input1 = sc1.next();
                    System.out.println("Enter name of a singleton matrix: ");
                    input2 = sc1.next();
                    System.out.println("Enter the operand sign: ");
                    for(int i = 0; i < matrices.size(); i++){
                        if(input1.equals(matrices.get(i).name)){
                            matrix1 = matrices.get(i).matrix;
                        }
                    }
                    for(int j = 0; j < matrices.size(); j++){
                        if(input2.equals(matrices.get(j).name)){
                            matrix2 = matrices.get(j).matrix;
                        }
                    }
                    use.singletonAsScalar(matrix1, matrix2, use, matrices);
                }
            }
            else if(optionNumber == 17){
                System.out.println("Enter name of matrix for calculating A + A' : ");
                String input1 = sc1.next();
                int [][] matrix1 = new int[0][0];
                int [][] matrix2 = new int[0][0];
                for(int i = 0; i < matrices.size(); i++){
                    if(input1.equals(matrices.get(i).name)){
                        matrix1 = matrices.get(i).matrix;
                        matrix2 = matrices.get(i).matrix;
                    }
                }
                matrix2 = use.transposeMatrix(matrix2);
                use.addMatrices(matrix1, matrix2, matrices);
            }
            else if(optionNumber == 18){

            }
            else if(optionNumber == 19){

            }
            else if(optionNumber == 20){
                String range1, range2, op;
                char r1, r2;
                int start, end;
                System.out.println("Enter type of matrix to retrieve: ");
                op = sc1.next();
                System.out.println("Enter range (space separated values): ");
                range1 = sc1.next();
                range2 = sc1.next();
                r1 = range1.charAt(0);
                r2 = range2.charAt(0);
                start = r1;
                end = r2;

                use.retrieveAll(matrices, op, start, end);
            }

        }

    }

    public static void printMatrix(int[][] matrix1){
        System.out.println("\n");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void printMatrix(int[] matrix1){
        System.out.println("\n");
        for (int i = 0; i < matrix1.length; i++) {
            System.out.print(" " + matrix1[i]);
        }
        System.out.println("\n");
    }

    @Override
    public void changeElements(int[][] matrix1) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        Scanner sc3 = new Scanner(System.in);
        int [][] nMatrix = new int[rows][columns];
        printMatrix(matrix1);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter new element for: " +i +","+j + " ");
                nMatrix[i][j] = sc3.nextInt();
            }

        }
        System.out.println("Matrix with changed elements is: ");
        printMatrix(nMatrix);

    }

    @Override
    public void addMatrices(int[][] matrix1, int[][] matrix2, ArrayList<Matrix> matrices) {
        int [][] sumMatrix = new int[0][0];

        if(matrix1.length != matrix2.length){
            System.out.println("Matrices not of equal sizes");
        }else{
            int rowLength = matrix1.length;
            int columnLength = matrix1[0].length;
            sumMatrix = new int[rowLength][columnLength];

            for(int i = 0; i < rowLength; i++){
                for(int j = 0; j < columnLength; j++){
                    sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            printMatrix(sumMatrix);
        }
    }

    @Override
    public void subtractMatrices(int[][] matrix1, int[][] matrix2, ArrayList<Matrix> matrices) {
        int [][] sumMatrix = new int[0][0];

        if(matrix1.length != matrix2.length){
            System.out.println("Matrices not of equal sizes");
        }else{
            int rowLength = matrix1.length;
            int columnLength = matrix1[0].length;
            sumMatrix = new int[rowLength][columnLength];

            for(int i = 0; i < rowLength; i++){
                for(int j = 0; j < columnLength; j++){
                    sumMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            printMatrix(sumMatrix);
        }
    }

    @Override
    public void multiplyMatrices(int[][] matrix1, int[][] matrix2, ArrayList<Matrix> matrices) {
        int newRows = matrix1.length;
        int newColumns = matrix2[0].length;
        int [][] sumMatrix = new int[newRows][newColumns];

        if(matrix1[0].length != matrix2.length){
            System.out.println("Matrices not of valid type");
        }
        else{
            int rowLength = matrix1.length;
            int columnLength = matrix2[0].length;
            sumMatrix = new int[rowLength][columnLength];

            for(int i = 0; i < rowLength; i++){
                for(int j = 0; j < columnLength; j++){
                    for(int k = 0; k < matrix2.length; k++){
                        sumMatrix[i][j] += matrix1[i][k] + matrix2[k][j];
                    }
                }
            }
            printMatrix(sumMatrix);
        }
    }

    @Override
    public void divideMatrices(int[][] matrix1, int divisor, ArrayList<Matrix> matrices) {
        int [][] sumMatrix = new int[0][0];

        if(divisor  == 0){
            System.out.println("Matrix cannot be divided by 0");
        }else{
            int rowLength = matrix1.length;
            int columnLength = matrix1[0].length;
            sumMatrix = new int[rowLength][columnLength];

            for(int i = 0; i < rowLength; i++){
                for(int j = 0; j < columnLength; j++){
                    sumMatrix[i][j] = matrix1[i][j] / divisor;
                }
            }
            printMatrix(sumMatrix);
        }
    }

    @Override
    public void elementWiseOperations(int[][] matrix1, int[][] matrix2, String operation) {
        int [][] sumMatrix = new int[0][0];

        if(matrix1.length != matrix2.length && matrix1[0].length != matrix2[0].length){
            System.out.println("Matrices cannot be operated");
        }
        else if(operation == "*"){
            int rowLength = matrix1.length;
            int columnLength = matrix1[0].length;
            sumMatrix = new int[rowLength][columnLength];

            for(int i = 0; i < rowLength; i++){
                for(int j = 0; j < columnLength; j++){
                    sumMatrix[i][j] = matrix1[i][j] * matrix2[i][j];
                }
            }
            printMatrix(sumMatrix);
        }
        else if(operation == "/"){
            int rowLength = matrix1.length;
            int columnLength = matrix1[0].length;
            sumMatrix = new int[rowLength][columnLength];

            for(int i = 0; i < rowLength; i++){
                for(int j = 0; j < columnLength; j++){
                    sumMatrix[i][j] = matrix1[i][j] / matrix2[i][j];
                }
            }
            printMatrix(sumMatrix);
        }
    }

    @Override
    public int[][] transposeMatrix(int[][] matrix1) {
        int [][] transposedMatrix = new int[matrix1[0].length][matrix1.length];

        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[0].length; j++){
                transposedMatrix[j][i] = matrix1[i][j];
            }
        }
        printMatrix(transposedMatrix);
        return transposedMatrix;
    }

    @Override
    public void inverseMatrix(int[][] matrix1) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int [][] inverseMatrix = new int[rows][columns];
        int div = 0;

        if(rows == 1 && columns == 1){
            inverseMatrix[0][0] = 1;
            System.out.println("Inverse of the matrix is: ");
            printMatrix(inverseMatrix);
        }
        else if(rows == 2 && columns == 2){
            div = determinant(inverseMatrix);
            inverseMatrix[0][0] = matrix1[1][1]/div;
            inverseMatrix[0][1] = -matrix1[0][1]/div;
            inverseMatrix[1][0] = -matrix1[1][0]/div;
            inverseMatrix[1][1] = matrix1[0][0]/div;
            System.out.println("Inverse of the matrix is: ");
            printMatrix(inverseMatrix);
        }
    }

    @Override
    public void rowMean(int[][] matrix1) {
        int [][] rowMeanMatrix = new int[matrix1.length][1];
        int rowValue;

        for(int i = 0; i < matrix1.length; i++){
            rowValue = 0;
            for(int j = 0; j < matrix1[0].length; j++){
                rowValue += matrix1[i][j];
            }
            rowMeanMatrix[i][0] = rowValue/matrix1[0].length;
        }
        printMatrix(rowMeanMatrix);

    }

    @Override
    public void columnMean(int[][] matrix1) {
        int [] columnMeanMatrix = new int[matrix1[0].length];
        int columnValue;

        for(int i = 0; i < matrix1[0].length; i++){
            columnValue = 0;
            for(int j = 0; j < matrix1.length; j++){
                columnValue += matrix1[j][i];
            }
            columnMeanMatrix[i] = columnValue/matrix1.length;
        }
        printMatrix(columnMeanMatrix);
    }

    @Override
    public void matrixMean(int[][] matrix1) {
        int [][] meanMatrix = new int[1][1];
        int mean = 0;
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[0].length; j++){
                mean += matrix1[i][j];
            }
        }
        int size = matrix1.length + matrix1[0].length;
        meanMatrix[0][0] = mean/size;
        printMatrix(meanMatrix);
    }

    @Override
    public int determinant(int[][] matrix1) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int determinant = 0, x, y, z;
        if(rows != columns){
            System.out.println("Determinant of only square matrices is possible!");
        }
        else if(rows == 1 && columns == 1){
            System.out.println(matrix1[0][0]);
        }
        else if(rows == 2 && columns == 2){
            determinant = (matrix1[0][0] * matrix1[1][1]) - (matrix1[0][1] * matrix1[1][0]);
        }
        else if (rows == 3 && columns == 3){
            x = (matrix1[1][1] * matrix1[2][2]) - (matrix1[2][1] * matrix1[1][2]);
            y = (matrix1[1][0] * matrix1[2][2]) - (matrix1[2][0] * matrix1[1][2]);
            z = (matrix1[1][0] * matrix1[2][1]) - (matrix1[2][0] * matrix1[1][1]);

            determinant = (matrix1[0][0] * x)- (matrix1[0][1] * y) + (matrix1[0][2] * z);
        }
        System.out.println("determinant of the chosen matrix is: " + determinant);
        return determinant;
    }

    @Override
    public void singletonAsScalar(int[][] matrix1, int[][] matrix2, Main use, ArrayList<Matrix> matrices) {
        String operation;
        Scanner sc2 = new Scanner(System.in);
        int [][] newMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                newMatrix[i][j] = matrix2[0][0];
            }
        }
        System.out.println("Enter operation to be performed: ");
        operation = sc2.next();
        if(operation.equals("+")){
            use.addMatrices(matrix1, matrix2, matrices);
        }
        else if(operation.equals("-")){
            use.subtractMatrices(matrix1, matrix2, matrices);
        }
        else if(operation.equals("*")){
            use.elementWiseOperations(matrix1, matrix2, operation);
        }
        else if(operation.equals("/")){
            use.elementWiseOperations(matrix1, matrix2, operation);
        }


    }

    @Override
    public void symmNonSymmOperations(int[][] matrix1) {
//        transposeMatrix(matrix1);
    }

    @Override
    public void eigenValue(int[][] matrix1) {

    }

    @Override
    public void solveLinearEquations(int[][] matrix1, int[][] matrix2) {

    }

    @Override
    public void retrieveAll(ArrayList<Matrix> matrices, String option, int start, int end) {
        int max = end - start + 1;
        for (int i = 0; i < matrices.size(); i++) {
            char aplha = (char)start;
            if(start <= end){
                if(aplha == matrices.get(i).name.charAt(0)){
                    for (int j = 0; j < matrices.get(i).matrixType.size(); j++) {
                        if(option.equals(matrices.get(i).matrixType.get(j))){
                            printMatrix(matrices.get(i).matrix);
                            start++;
                        }
                    }
                }
            }
        }
    }
}
