package Chapter1;

import CtCILibrary.AssortedMethods;

public class ZeroMatrix {
	public static int[][] zeroMatrix(int[][] matrix) {
		int row = matrix.length;
		int column = matrix[0].length;
		int[][] location = new int[row*column][2];
		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j =0; j < column; j++) {
				if (matrix[i][j] == 0) {
					location[count][0] = i;
					location[count][1] = j;
					count++;
				}
			}
		}
		for (int c = 0; c < count; c++) {
			int x = location[c][0];
			int y = location[c][1];
			for (int i = 0; i < column; i++)
				matrix[x][i] = 0;
			for (int j = 0; j < row; j++)
				matrix[j][y] = 0;
		}
		return matrix;
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
 * Space Complexity O(MN), M and N are row and column of the input matrix separately  
 * Time Complexity O(MN), M and N are row and column of the input matrix separately 
 */