import java.util.Scanner;
public class Ex66 {

	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		System.out.print("Please input the number of rows and columns in the Matrix: ");
		int row = N.nextInt();
		int column = N.nextInt();
		int[][] A = new int[row][column];
        int[][] B = new int[row][column];
        int[][] C = new int[row][column];
        System.out.println("Please input the first matrix:");
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                A[i][j] = N.nextInt();
            }
        }
        System.out.println("Please input the second matrix:");
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                B[i][j] = N.nextInt();
            }
        }
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("The sum of the first matrix and the second matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(C[i][j]+ " ");
            }
            System.out.println();
        }

	}

}
