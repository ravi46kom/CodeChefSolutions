package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Game_between_friends {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			if (b <= a) {
				b += c;
				if (b <= a) {
					b += d;
				} else {
					a += d;
				}
			} else if (a < b) {
				a += c;
				if (a < b) {
					a += d;
				} else {
					b += d;
				}
			}
			if (a >= b) {
				System.out.println('N');
			} else {
				System.out.println('S');
			}
		}
	}

}
