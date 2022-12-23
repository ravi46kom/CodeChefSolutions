package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Chef_and_Water_Bottles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int N = sc.nextInt();
			int X = sc.nextInt();
			int K = sc.nextInt();
			int count = 0;
			while (N > 0 && X > 0 && K > 0) {
				if (X > K) {
					break;
				} else {
					K = K - X;
					N = N - 1;
					count++;
				}

			}
			System.out.println(count);

		}

	}

}
