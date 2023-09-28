package com.codechef.array_0_1000;

import java.util.Scanner;

public class Oneful_Pairs {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(a + b + (a * b) == 111 ? "YES" : "NO");
	}

}
