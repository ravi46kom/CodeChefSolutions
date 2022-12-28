package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Slow_Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int maxT = s.nextInt();
			int maxN = s.nextInt();
			int sumN = s.nextInt();
			if (sumN / maxN >= maxT) {
				System.out.println(maxT * maxN * maxN);
			} else if (sumN / maxN < maxT) {
				int div = sumN / maxN;
				int mod = sumN % maxN;
				System.out.println(div * maxN * maxN + mod * mod);
			}
		}
	}

}
