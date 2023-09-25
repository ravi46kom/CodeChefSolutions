package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Elections_in_Chefland {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int x = s.nextInt();
			int res = 0;
			for (int i = 0; i < n; i++) {
				if (s.nextInt() >= x)
					res++;
			}
			System.out.println(res);
		}

	}

}
