import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int result = det3D(input());
        System.out.println("Determinant = " + result);
    }

    public static int[][] input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press 1 for 2x2 or 2 for 3x3 matrix: ");
        int in = sc.nextInt();
        int choice;
        switch (in) {
            case 1:
                choice = 2;
                break;
            case 2:
                choice = 3;
                break;
            default:
                throw new NumberFormatException("Only two options (1 or 2)");
        }

        int[][] matrix = new int[choice][choice];

        System.out.println("Enter value at respective positions: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("i = " + i + ", j = " + j + " -> ");
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }


    public static int det3D(int[][] matrix) {
        if (matrix.length < 3) {
            return det2D(matrix);
        }

        int row11, row12, row13;

        row11 = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]);

        row12 = matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);

        row13 = matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);

        return row11 - row12 + row13;


    }

    public static int det2D(int[][] matrix) {

        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

}