package com.codechef.Dynamic_Programming_0_1000;

import java.util.Scanner;

public class Bytelandian_gold_coins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long result = n / 2 + n / 3 + n / 4;
		System.out.println(n >= result ? n : result);
	}

}
