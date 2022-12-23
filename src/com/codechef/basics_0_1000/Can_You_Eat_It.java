package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Can_You_Eat_It {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			if (n > k && n % k != 0) {
				System.out.println(-1);
			} else {
				System.out.println(n / k);

			}
		}
	}

}
