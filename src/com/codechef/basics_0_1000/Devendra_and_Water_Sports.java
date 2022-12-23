package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Devendra_and_Water_Sports {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int z = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if ((z - y) >= (a + b + c)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
