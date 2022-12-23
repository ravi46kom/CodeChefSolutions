package com.codechef.math_0_1000;

import java.util.Scanner;

public class Packing_Books {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int x = s.nextInt();
			int y = s.nextInt();
			int z = s.nextInt();
			double val = (double) y / z;
			int res = (int) Math.ceil(val);
			System.out.println(x * res);
		}
	}

}
