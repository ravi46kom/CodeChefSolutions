package com.codechef.Contest1599;

import java.util.Scanner;

public class Hello_Equation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			boolean flag = false;
			for (int i = 1; i * i <= x; i++) {
				if ((x - (2 * i)) % (i + 2) == 0 && x != 2 * i) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
