package com.codechef.math_0_1000;

import java.util.Scanner;

public class Ranklist_Pages {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int res = x % 25 == 0 ? x / 25 : (x / 25) + 1;
			System.out.println(res);
		}
	}

}
