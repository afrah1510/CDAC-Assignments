class Matrix {
    int row;
    int col;
    int[][] elements;

    Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.elements = new int[row][col];
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return col;
    }

    public void setElements(int row, int col, int value) {
        elements[row][col] = value;
    }

    public int getElements(int row, int col) {
        return elements[row][col];
    }

    public static Matrix addMatrix(Matrix a, Matrix b) {
        if (a.row != b.row || a.col != b.col) {
            System.out.println("Matrix cannot be added");
            return null;
        }

        Matrix add = new Matrix(a.row, a.col);
        for (int i = 0; i < a.row; i++) {
            for (int j = 0; j < a.col; j++) {
                add.elements[i][j] = a.getElements(i, j) + b.getElements(i, j);
            }
        }
        return add;
    }

    public static Matrix mulMatrix(Matrix a, Matrix b) {
        if (a.col != b.row) {
            System.out.println("Matrix cannot be multiplied");
            return null;
        }

        Matrix mul = new Matrix(a.row, b.col);
        for (int i = 0; i < a.row; i++) {
            for (int j = 0; j < b.col; j++) {
                for (int k = 0; k < a.col; k++) {
                    mul.elements[i][j] += a.getElements(i, k) * b.getElements(k, j);
                }
            }
        }
        return mul;
    }

    public void printMatrix() {
        for (int i = 0; i < row; i++) {
            System.out.print("[");
            for (int j = 0; j < col; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 2);
        m1.setElements(0, 0, 1);
        m1.setElements(0, 1, 2);
        m1.setElements(1, 0, 3);
        m1.setElements(1, 1, 4);

        Matrix m2 = new Matrix(2, 2);
        m2.setElements(0, 0, 5);
        m2.setElements(0, 1, 6);
        m2.setElements(1, 0, 7);
        m2.setElements(1, 1, 8);

        System.out.println("Addition of Matrix: ");
        Matrix addRes = Matrix.addMatrix(m1, m2);
        if (addRes != null) {
            addRes.printMatrix();
        }

        System.out.println("\nMultiplication of Matrix: ");
        Matrix mulRes = Matrix.mulMatrix(m1, m2);
        if (mulRes != null) {
            mulRes.printMatrix();
        }
    }
}
