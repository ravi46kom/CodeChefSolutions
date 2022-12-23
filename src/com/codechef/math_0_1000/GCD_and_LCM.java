package com.codechef.math_0_1000;

import java.math.BigInteger;
import java.util.Scanner;

public class GCD_and_LCM {
	public static long gcd(long a, long b) {
		if (a < b) {
			return gcd(b, a);
		} else if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			long gcd_1 = gcd(a, b);
			long lcm = (a / gcd_1) * (b / gcd_1) * gcd_1;
			System.out.println(gcd_1 + " " + lcm);
		}

	}

}
