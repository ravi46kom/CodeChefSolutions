package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Chef_on_Vacation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t --> 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			if ((x + y) <= z) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
