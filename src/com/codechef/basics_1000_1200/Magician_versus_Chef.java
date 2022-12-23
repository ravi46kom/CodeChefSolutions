package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class Magician_versus_Chef {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int s = sc.nextInt();
			while(s != 0) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				x = x == a ? b : x == b ? a : x;
				s--;
			}
			System.out.println(x);
		}
	}

}
