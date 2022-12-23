package com.codechef.Contest1399;

import java.util.Scanner;

public class Slow_Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int maxT = sc.nextInt();
			int maxN = sc.nextInt();
			int sumN = sc.nextInt();
			int pow = maxN * maxN;
			int dev = 0, mod = 0;
			if ((maxT * maxN) <= sumN) {
				System.out.println(maxT * pow);
			} else {
				if (sumN % maxN == 0) {
					dev = sumN / maxN;
					System.out.println(pow * dev);
				} else {
					dev = sumN / maxN;
					mod = sumN % maxN;
					System.out.println((dev * pow) + (mod * mod));
				}
			}
		}
	}

}
