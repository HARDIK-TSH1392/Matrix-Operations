package A3;

import java.util.ArrayList;

public class MatrixType {
    ArrayList<String> matrixType = new ArrayList<String>();

    public void rectangularMatrix(int rows, int columns, ArrayList<String> matrixType){
        if(rows != columns){
            matrixType.add("Rectangular Matrix");
        }
    }

    public void rowMatrix(int rows, int columns,  ArrayList<String> matrixType){
        if(rows == 1){
            matrixType.add("Row Matrix");
        }
    }

    public void columnMatrix(int rows, int columns, ArrayList<String> matrixType){
        if(columns == 1){
            matrixType.add("Column Matrix");
        }
    }

    public void squareMatrix(int rows, int columns, ArrayList<String> matrixType){
        if( rows == columns){
            matrixType.add("Square Matrix");
        }
    }

    public Boolean transposeMatrix(int rows, int columns, int [][] matrix){
        int [][] newMatrix = new int[columns][rows];
        boolean flag = true;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                newMatrix[j][i] = matrix[i][j];
            }
        }
        for(int i = 0; i< rows; i++){
            for(int j = 0; j< columns; j++){
                if(newMatrix[i][j] != matrix[i][j]){
                    return flag = false;
                }
            }
        }
//        if(flag){
//            matrixType.add("Transpose Matrix");
//        }
        return flag;
    }

    public void symmetricMatrix(int rows, int columns, ArrayList<String> matrixType, int [][] matrix){
        boolean check = false;
        if(rows == columns){
            check = transposeMatrix(rows, columns, matrix);
        }
//        boolean check = transposeMatrix(rows, columns, matrix);
        if(check){
            matrixType.add("Symmetric Matrix");
        }
    }

    public void skewSymmMatrix(int rows, int columns, ArrayList<String> matrixType, int [][] matrix){
        boolean check = false;
        if(rows == columns){
            check = transposeMatrix(rows, columns, matrix);
        }
        if(!check){
            matrixType.add("Skew-symmetric Matrix");
        }
    }

    public void upperTriangularMatrix(int rows, int columns, ArrayList<String> matrixType, int [][] matrix){
        boolean checkMatrix = true;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows; j++){
                if(matrix[i][j] != 0){
                    checkMatrix = false;
                    break;
                }
            }
        }
        if(!checkMatrix && rows == columns){
            matrixType.add("Upper-triangular Matrix");
        }
    }

    public void lowerTriangularMatrix(int rows, int columns, ArrayList<String> matrixType, int [][] matrix) {
        boolean checkMatrix = true;
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < columns; i++) {
                if (matrix[i][j] != 0) {
                    checkMatrix = false;
                    break;
                }
            }
        }
        if (!checkMatrix && rows == columns) {
            matrixType.add("Lower-triangular Matrix");
        }
    }

    public void singularMatrix(int rows, int columns, ArrayList<String> matrixType, int [][] matrix){
        int determinant = 0, x, y, z;
        if(rows == columns){
            if(rows == 1 && columns == 1){
                determinant = matrix[0][0];
            }
            else if(rows == 2 && columns == 2){
                determinant = (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
            }
            else if (rows == 3 && columns == 3){
                x = (matrix[1][1] * matrix[2][2]) - (matrix[2][1] * matrix[1][2]);
                y = (matrix[1][0] * matrix[2][2]) - (matrix[2][0] * matrix[1][2]);
                z = (matrix[1][0] * matrix[2][1]) - (matrix[2][0] * matrix[1][1]);

                determinant = (matrix[0][0] * x)- (matrix[0][1] * y) + (matrix[0][2] * z);
            }
        }

        if(determinant == 0){
            matrixType.add("Singular Matrix");
        }
    }

    public void diagonalMatrix(int rows, int columns, ArrayList<String> matrixType, int [][] matrix){
        if(rows == columns) {
            if (rows == 1 && columns == 1) {
                matrixType.add("Diagonal Matrix");
            } else if (rows == 2 && columns == 2) {
                if (matrix[0][1] != 0) {
                    return;
                }
            } else if (rows == 3 && columns == 3) {
                if (matrix[0][2] != 0) {
                    return;
                }
            }else{
                matrixType.add("Diagonal Matrix");
            }
        }
    }

    public void scalarMatrix(int rows, int columns, ArrayList<String> matrixType, int [][] matrix){
        boolean checker = true;
        if(rows == columns) {
            if (rows == 1 && columns == 1) {
                checker = false;
                matrixType.add("Scalar Matrix");
            }
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    if(i == j){
                        if(matrix[i][j] != matrix[0][0]){
                            checker = false;
                            return;
                        }
                    }
                }
            }
        }
        if(checker){
            matrixType.add(("Scalar Matrix"));
        }
    }

    public void identityMatrix(int rows, int columns, ArrayList<String> matrixType, int [][] matrix){
        if(rows == columns) {
            if (rows == 1 && columns == 1 && matrix[0][0] == 0) {
                matrixType.add("Identity Matrix");
            } else if (rows == 2 && columns == 2) {
                if (matrix[0][0] == 0 && matrix[1][1] == 0) {
                    matrixType.add("Identity Matrix");
                }
            } else if (rows == 3 && columns == 3) {
                if (matrix[0][0] == 0 && matrix[1][1] == 0 && matrix[2][2] == 0) {
                    matrixType.add("Identity Matrix");
                }
            }
        }
    }

    public void singletonMatrix(int rows, int columns, ArrayList<String> matrixType){
        if(rows == 1 && columns == 1){
            matrixType.add("Singleton Matrix");
        }
    }

    public void onesMatrix(int rows, int columns, ArrayList<String> matrixType, int [][] matrix){
        boolean checker = true;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(matrix[i][j] != 1){
                    checker = false;
                    return;
                }
            }
        }
        if(checker){
            matrixType.add("Ones Matrix");
        }
    }

    public void nullMatrix(int rows, int columns, ArrayList<String> matrixType, int [][] matrix){
        boolean checker = true;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(matrix[i][j] != 1){
                    checker = false;
                    return;
                }
            }
        }
        if(checker){
            matrixType.add("Null Matrix");
        }
    }

}
