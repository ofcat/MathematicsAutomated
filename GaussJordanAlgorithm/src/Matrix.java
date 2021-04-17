public class Matrix {
    private int row = 0;
    private int col = 0;
    private int[][] matrix; // my Gauss algo implementation so far only works on 2x2 and 3x3 matrices

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        matrix = new int[row][col];
    }

    public Matrix() {

    }

    //creates and fills a matrix with random values
    public static Matrix fillRandom(int row, int col) {
        Matrix matrix = new Matrix(row, col);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix.matrix[i][j] = (int) (Math.random() * 10); // random values from 0 to 9
            }
        }
        return matrix;
    }

    //output method
    public void print() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    //sums all values
    public int sum() {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    /*public Matrix gauss(){

    }*/


}
