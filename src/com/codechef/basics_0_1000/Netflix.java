package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Netflix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t --> 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int x = s.nextInt();
			System.out.println(a+b>=x||a+c>=x||b+c>=x?"YES":"NO");
		}
	}

}
