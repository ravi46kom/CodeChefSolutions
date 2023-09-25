package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Dividing_Stamps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int val = 0;
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			sum += c[i];
			val += i + 1;
		}
		System.out.println(val == sum ? "YES" : "NO");
	}

}
