package com.codechef.array_0_1000;

import java.math.BigInteger;
import java.util.Scanner;

public class Small_factorials {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			BigInteger fact = new BigInteger("1");
			for (int i = 2; i <= n; i++) {
				fact = fact.multiply(BigInteger.valueOf(i));
			}
			System.out.println(fact);
		}
	}

}
