package com.codechef.math_0_1000;

import java.util.Scanner;

public class Richie_Rich {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = sc.nextInt();
			System.out.println((b-a)%x == 0?(b-a)/x:1+(b-a)/x);
		}
	}

}
