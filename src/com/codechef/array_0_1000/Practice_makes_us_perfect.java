package com.codechef.array_0_1000;

import java.util.Scanner;

public class Practice_makes_us_perfect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		int count = 0;
		for (int i = 0; i < 4; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] >= 10) {
				count++;
			}
		}
		System.out.println(count);
	}

}
