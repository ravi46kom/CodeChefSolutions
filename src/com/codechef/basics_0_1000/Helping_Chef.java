package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Helping_Chef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int N = sc.nextInt();
			if (N < 10) {
				System.out.println("Thanks for helping Chef!");
			} else {
				System.out.println(-1);
			}
		}

	}

}
