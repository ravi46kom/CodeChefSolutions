package com.codechef.Contest1599;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Sum {
	static int gcd(long a, long b) {
		 if(b == 0) {
			 return (int) a;
		 }else {
			return gcd(b, a%b);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			long n = sc.nextLong();
			long x = sc.nextLong();
			for(int i = 1; i< n; i++) {
				long val = sc.nextInt();
				x = gcd(x, val);
			}

			System.out.println(x*n);
		}
	}

}
