package com.codechef.basics_0_1000;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		float n = sc.nextFloat();
			if (x % 5 == 0 && n>= (n + 0.5f)) {
				System.out.println(String.format("%.2f", n - x - 0.5f) );
			}
			else {
				System.out.println(String.format("%.2f", n));
			}
	}

}
