package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Important_Pages_on_CodeChef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A == 0) {
			System.out.println("https://www.codechef.com/practice");
		} else if (A == 1 && B == 0) {
			System.out.println("https://www.codechef.com/contests");
		} else if (A == 1 && B == 1) {
			System.out.println("https://discuss.codechef.com");
		}

	}

}
