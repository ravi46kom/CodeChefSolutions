package com.codechef.Contest1399;

import java.util.Scanner;

public class Find_A_B_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n + 1];
			int a = 0, b = 0, c = 0;
			for (int i = 0; i <= n; i++) {
				arr[i] = sc.nextInt();

			}
			for (int i = 0; i <= n; i++) {
				for (int k = 0; k <= n; k++) {
					for (int l = 0; l <= n; l++) {
						int x = i;
						int y = k;
						int z = l;
						for (int j = 0; i <= n; j++) {
							if ((x ^ j) + (y ^ j) + (z ^ j) == arr[0]) {
								break;
							}
						}
						for (int m = 0; m <= n; m++) {
							if ((x ^ m) + (y ^ m) + (z ^ m) == arr[1]) {
								break;
							}
						}
						for (int o = 0; o <= n; o++) {
							if ((x ^ o) + (y ^ o) + (z ^ o) == arr[2]) {
								a = i;
								b = k;
								c = l;
								break;
							}

						}

					}
				}
			}
			System.out.println(a + " " + b + " " + c);
		}

	}

}
