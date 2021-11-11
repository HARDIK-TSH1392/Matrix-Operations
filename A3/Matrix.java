package A3;

import java.util.Scanner;

public class Matrix extends MatrixType {
    int rows;
    int columns;
    int [][] matrix;
    String name;
    String typeOfMatrix;

    Scanner sc = new Scanner(System.in);


    Matrix(String name, int rows, int columns, int [][] matrix){
        this.rows = rows;
        this.columns = columns;
        this.matrix = matrix;
        this.name = name;

        rectangularMatrix(rows, columns, matrixType);
        rowMatrix(rows, columns, matrixType);
        columnMatrix(rows, columns, matrixType);
        squareMatrix(rows, columns, matrixType);
//        transposeMatrix(rows, columns, matrix);
        symmetricMatrix(rows, columns, matrixType, matrix);
        skewSymmMatrix(rows, columns, matrixType, matrix);
        upperTriangularMatrix(rows, columns, matrixType, matrix);
        lowerTriangularMatrix(rows, columns, matrixType, matrix);
        singularMatrix(rows, columns, matrixType, matrix);
        diagonalMatrix(rows, columns, matrixType, matrix);
        scalarMatrix(rows, columns, matrixType, matrix);
        identityMatrix(rows, columns, matrixType, matrix);
        singletonMatrix(rows, columns, matrixType);
        onesMatrix(rows, columns, matrixType, matrix);
        nullMatrix(rows, columns, matrixType, matrix);


    }

    Matrix(String name, int rows, int columns, String typeOfMatrix){
        this.name = name;
        this.typeOfMatrix = typeOfMatrix;
        this.rows = rows;
        this.columns = columns;
        matrix = generateMatrix(rows, columns, typeOfMatrix);
        rectangularMatrix(rows, columns, matrixType);
        rowMatrix(rows, columns, matrixType);
        columnMatrix(rows, columns, matrixType);
        squareMatrix(rows, columns, matrixType);
//        transposeMatrix(rows, columns, matrix);
        symmetricMatrix(rows, columns, matrixType, matrix);
        skewSymmMatrix(rows, columns, matrixType, matrix);
        upperTriangularMatrix(rows, columns, matrixType, matrix);
        lowerTriangularMatrix(rows, columns, matrixType, matrix);
        singularMatrix(rows, columns, matrixType, matrix);
        diagonalMatrix(rows, columns, matrixType, matrix);
        scalarMatrix(rows, columns, matrixType, matrix);
        identityMatrix(rows, columns, matrixType, matrix);
        singletonMatrix(rows, columns, matrixType);
        onesMatrix(rows, columns, matrixType, matrix);
        nullMatrix(rows, columns, matrixType, matrix);
    }

    public int [][] createMatrix(int rows, int columns){
        matrix = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.println("Enter elements of row " + (i+1) + " : " );
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public int[][] generateMatrix(int rows, int columns, String typeOfMatrix){
        matrix = new int[rows][columns];
        int[][] tempMatrix = {{0,0,0},
                              {0,0,0},
                              {0,0,0}};

        if(typeOfMatrix.equals("rectangular")){
            tempMatrix = new int[][]{{1, 2, 3},
                                     {4, 5, 6},
                                     {7, 8, 9}};

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] = tempMatrix[i][j];
                }
            }
            return matrix;

        }
        else if(typeOfMatrix.equals("row")){
            tempMatrix = new int[][]{{1, 2, 3},
                                     {4, 5, 6},
                                     {7, 8, 9}};

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] = tempMatrix[i][j];
                }
            }
            return matrix;

        }
        else if(typeOfMatrix.equals("column")){
            tempMatrix = new int[][]{{1, 2, 3},
                                     {4, 5, 6},
                                     {7, 8, 9}};

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] = tempMatrix[i][j];
                }
            }
            return matrix;

        }
        else if(typeOfMatrix.equals("square")){
            tempMatrix = new int[][]{{1, 2, 3},
                                     {4, 5, 6},
                                     {7, 8, 9}};

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] = tempMatrix[i][j];
                }
            }
            return matrix;

        }
        else if(typeOfMatrix.equals("symmetric")){
            tempMatrix = new int[][]{{1, 2, 3},
                                     {2, 4, 5},
                                     {3, 5, 6}};

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] = tempMatrix[i][j];
                }
            }
            return matrix;

        }
        else if(typeOfMatrix.equals("skew-symmetric")){
            tempMatrix = new int[][]{{1, 2, 3},
                                     {4, 5, 6},
                                     {7, 8, 9}};

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] = tempMatrix[i][j];
                }
            }
            return matrix;

        }
        else if(typeOfMatrix.equals("upperTriangular")){
            tempMatrix = new int[][]{{1, 2, 3},
                                     {0, 4, 5},
                                     {0, 0, 6}};

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] = tempMatrix[i][j];
                }
            }
            return matrix;

        }
        else if(typeOfMatrix.equals("lowerTriangular")){
            tempMatrix = new int[][]{{1, 0, 0},
                                     {2, 3, 0},
                                     {4, 5, 6}};

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] = tempMatrix[i][j];
                }
            }
            return matrix;

        }
        else if(typeOfMatrix.equals("singular")){
            tempMatrix = new int[][]{{0, 0, 0},
                                     {1, 2, 3},
                                     {4, 5, 6}};

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] = tempMatrix[i][j];
                }
            }
            return matrix;

        }
        else if(typeOfMatrix.equals("diagonal")){
            tempMatrix = new int[][]{{1, 0, 0},
                                     {0, 2, 0},
                                     {0, 0, 3}};

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] = tempMatrix[i][j];
                }
            }
            return matrix;

        }
        else if(typeOfMatrix.equals("scalar")){
            tempMatrix = new int[][]{{2, 0, 0},
                                     {0, 2, 0},
                                     {0, 0, 2}};

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] = tempMatrix[i][j];
                }
            }
            return matrix;

        }
        else if(typeOfMatrix.equals("identity")){
            tempMatrix = new int[][]{{1, 0, 0},
                                     {0, 1, 0},
                                     {0, 0, 1}};

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] = tempMatrix[i][j];
                }
            }
            return matrix;

        }
        else if(typeOfMatrix.equals("singleton")){
            tempMatrix = new int[][]{{2, 0, 0},
                                     {0, 2, 0},
                                     {0, 0, 2}};

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] = tempMatrix[i][j];
                }
            }
            return matrix;

        }
        else if(typeOfMatrix.equals("ones")){
            tempMatrix = new int[][]{{1, 1, 1},
                                     {1, 1, 1},
                                     {1, 1, 1}};

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] = tempMatrix[i][j];
                }
            }
            return matrix;

        }
        else if(typeOfMatrix.equals("null")){
            tempMatrix = new int[][]{{0, 0, 0},
                                     {0, 0, 0},
                                     {0, 0, 0}};

            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    matrix[i][j] = tempMatrix[i][j];
                }
            }
            return matrix;

        }

        return matrix;
    }

}
