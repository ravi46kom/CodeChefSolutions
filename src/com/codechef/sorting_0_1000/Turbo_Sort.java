package com.codechef.sorting_0_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Turbo_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a[] = new int[t];
		for (int i = 0; i < t; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
