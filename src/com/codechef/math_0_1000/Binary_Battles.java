package com.codechef.math_0_1000;

import java.util.Scanner;

public class Binary_Battles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int expo = 0;
			while(n != 1) {
				n /= 2;
				expo++;
			}
			int result = (a*expo) + b * (expo-1);
			System.out.println(result);
		}
	}

}
