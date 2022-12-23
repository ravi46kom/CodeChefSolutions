package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Penalty_Shots {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int even = 0;
			int odd = 0;
			int[] arr = new int[10];
			for (int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
				if (i % 2 == 0) {
					odd += arr[i];
				} else {
					even += arr[i];
				}
			}
			if (even > odd) {
				System.out.println(2);
			} else if (even < odd) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}

	}

}
