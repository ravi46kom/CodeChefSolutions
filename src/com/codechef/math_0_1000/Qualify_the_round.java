package com.codechef.math_0_1000;

import java.util.Scanner;

public class Qualify_the_round {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int x = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt()*2;
			System.out.println(x<=(a+b) ? "Qualify":"NotQualify");
		}
	}

}
