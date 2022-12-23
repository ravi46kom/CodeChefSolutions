package com.codechef.Contest1399;

import java.util.Scanner;

public class Game_of_Piles_Version_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] s = new int[n];
			int count = 0;
			int val = 0;
			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
				val += s[i];
				if (s[i] == 1) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println("Chef");
			} else {
				if (val % 2 == 0) {
					System.out.println("Chefina");
				} else {
					System.out.println("Chef");

				}
			}
//			Arrays.sort(s);
//			if (s[0] % 2 == 0) {
//				System.out.println("Chefina");
//			} else {
//				System.out.println("Chef");
//			}

		}
	}

}
