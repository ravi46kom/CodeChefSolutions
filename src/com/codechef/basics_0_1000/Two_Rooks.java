package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Two_Rooks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int[][] arr = new int[8][8];
			int x_1 = sc.nextInt() - 1;
			int y_1 = sc.nextInt() - 1;
			int x_2 = sc.nextInt() - 1;
			int y_2 = sc.nextInt() - 1;
			arr[x_1][y_1] = 1;
			arr[x_2][y_2] = 1;
			int count = 0;
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (i == x_1 && j >= 0 && j < 8 || j == y_1 && i >= 0 && i < 8) {
						count += arr[i][j];
					}
				}
			}
			if (count < 2) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}

		}
	}

}
