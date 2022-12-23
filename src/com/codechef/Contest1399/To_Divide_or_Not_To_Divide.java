package com.codechef.Contest1399;

import java.util.Scanner;

public class To_Divide_or_Not_To_Divide {
	public static void number(int num, int a, int b) {
		if (num % a == 0) {
			int res = num / a;
			if (num % b == 0) {
				res++;
			}
			System.out.println(res*a);

		} else if (num % a != 0) {
			int res = num / a;
			res++;
			if ((res * a) % b == 0) {
				res++;
			}
			System.out.println(res*a);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			if (a % b == 0) {
				System.out.println(-1);
			} else {
				number(n, a, b);

			}
		}
	}

}
