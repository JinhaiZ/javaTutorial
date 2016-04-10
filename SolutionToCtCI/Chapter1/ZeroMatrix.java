package Chapter1;

import CtCILibrary.AssortedMethods;

public class ZeroMatrix {
	public static void zeroMatrix(int[][] matrix) {
		int row = matrix.length;
		int column = matrix[0].length;
		boolean rowFlag[] = new boolean[row];
		boolean columnFlag[] = new boolean[column];
		for (int i = 0; i < row; i++) {
			for (int j =0; j < column; j++) {
				if (matrix[i][j] == 0) {
					rowFlag[i] = true;
					columnFlag[j] = true;
				}
			}
		}
		for(int i = 0; i < row; i++) {
			if(rowFlag[i]) {
				for(int j = 0; j < column; j++ ) {
					matrix[i][j] = 0;
				}
			}
		}
		for(int j = 0; j < column; j++) {
			if(columnFlag[j]) {
				for(int i = 0; i < row; i++ ) {
					matrix[i][j] = 0;
				}
			}
		}
	}
	public static void main(String args[]) {
		int nrows = 10;
		int ncols = 15;
		int[][] matrix = AssortedMethods.randomMatrix(nrows, ncols, -10, 10);		

		AssortedMethods.printMatrix(matrix);
		
		zeroMatrix(matrix);
		
		System.out.println();
		
		AssortedMethods.printMatrix(matrix);
	}
}
/*
 * Space Complexity O(N)
 * Time Complexity O(MN), M and N are row and column of the input matrix separately 
 */