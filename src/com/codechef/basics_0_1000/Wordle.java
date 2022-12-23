package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Wordle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a > b && c > b)
				System.out.println("Bob");
			else if (c > a && b > a)
				System.out.println("Draw");
			else
				System.out.println("Alice");
		}
	}

}
