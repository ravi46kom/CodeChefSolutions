package com.codechef.math_0_1000;

import java.util.Scanner;

public class Two_vs_Ten {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int x = sc.nextInt();
			System.out.println(x%10==0 || x == 0?0:(2*x)%10 == 0?1:-1 );
		}
	}

}
