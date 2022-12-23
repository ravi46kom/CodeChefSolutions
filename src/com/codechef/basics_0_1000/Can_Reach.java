package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Can_Reach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int k = sc.nextInt();
			if (k == 1) {
				System.out.println("Yes");
			} else if (k > 1 && Math.abs(x) % k == 0 && Math.abs(y) % k == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
