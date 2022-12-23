package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Zero_Ones_Equal_One_Zeros {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n / 2; i += 2) {
				if (n % 2 == 0) {
					arr[i] = 1;
					arr[n - 1] = 1;
					n -= 2;

				} else {
					arr[i + 1] = 1;
					arr[n - 2] = 1;
					n -= 2;
				}
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

}
