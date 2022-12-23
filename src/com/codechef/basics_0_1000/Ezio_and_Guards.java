package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Ezio_and_Guards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int i = 1;
		while (tc -->0) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			if (Y < X) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}
