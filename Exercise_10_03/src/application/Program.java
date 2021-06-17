package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		Integer matrix[][] = new Integer[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int number = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == number) {
					System.out.printf("Position %d,%d:", i, j);
					System.out.println();
					
					if(j > 0) {
						System.out.printf("Left: %d\n", matrix[i][j-1]);
					}
					
					if (i > 0) {
						System.out.printf("Up: %d\n", matrix[i-1][j]);
					}
					
					if (j < matrix[i].length - 1) {
						//System.out.printf("matrix[i].length = %d | i = %d | j = 0\n", matrix[i].length, i, j);
						System.out.printf("Right: %d\n", matrix[i][j+1]);
					}
					
					if (i < matrix.length - 1) {
						//System.out.printf("matrix.length = %d | i = %d | j = 0\n", matrix.length, i, j);
						System.out.printf("Down: %d\n", matrix[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
