package com.codechef.Contest1399;

import java.util.Scanner;

public class Average_Permutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			if (n == 3) {
				System.out.println(3 + " " + 2 + " " + 1);
			} else {
				System.out.print(n-1 + " " + (n - 2) + " ");
				for (int i = 1; i < n - 3; i++) {
					System.out.print(i + " ");
				}
				System.out.println(n - 3 + " " + n);
			}
		}

	}

}
