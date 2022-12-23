package com.codechef.math_0_1000;

import java.util.Scanner;

public class The_Cooler_Dilemma_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(y<=x?0:((y%x == 0)?(y/x)-1:y/x));
		}
	}

}
