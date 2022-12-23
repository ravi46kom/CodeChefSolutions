package com.codechef.basics_0_1000;

import java.util.Scanner;

public class The_Lead_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int l = Integer.MIN_VALUE;
		int w = 0, val1 = 0, val2 = 0;

		while (N-- > 0) {
//			int S = sc.nextInt();
//			int T = sc.nextInt();
//			if (l < Math.abs(S - T)) {
//				l = S - T;
//				if (S > T) {
//					w = 1;
//				}else {
//					w = 2;
//
//				}
//			}
			int[] S = new int[2];
			S[0] = sc.nextInt();
			S[1] = sc.nextInt();
			val1 += S[0];
			val2 += S[2];
			int dif = Math.abs(val1 - val2);
			if (l < dif) {
				l = dif;
				if (val1>val2) {
					w = 1;
				} else 
					w = 2;
				
			}
		}
		System.out.println(w + " " + l);

	}

}
