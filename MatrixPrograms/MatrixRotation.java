//Program-27
package MatrixPrograms;

import java.util.Scanner;
import Common.SharedFunctions;

public class MatrixRotation extends SharedFunctions {
	static int[][] getRotatedMatrix(int[][] mat){
		int n = mat.length;
		int transmat[][] = new int[n][n];
		//Transposing
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				//Adding Data
				transmat[j][i] = mat[i][j];
			}
		}
		//Row Reversal
		int rev[][] = new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				rev[i][n-j-1] = transmat[i][j];
			}
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		System.out.println();
		int mat[][] = new int[n][n];
		// Accepting
		System.out.println("Enter Elements: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// Adding Data
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nOriginal Matrix: ");
		printMatrix(mat, " ");
		int[][] xmat = getRotatedMatrix(mat);
		System.out.println("\n90Deg Rotated Matrix: ");
		printMatrix(xmat, " ");


		int sum = mat[0][0] + mat[0][n-1] + mat[n-1][0] + mat[n-1][n-1];
		System.out.println("\nSum of Corners: " + sum);
		sc.close();
	}
}
