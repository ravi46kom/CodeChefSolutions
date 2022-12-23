package com.codechef.math_0_1000;

import java.util.Scanner;

public class Reverse_The_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int n = sc.nextInt();
			int rev = 0;
			while(n > 0) {
				rev = rev*10+n%10;
				n = n/10;
			}
			System.out.println(rev);
			
		}
	}

}
