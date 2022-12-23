package com.codechef.math_0_1000;

import java.util.Scanner;

public class Weights {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int w = s.nextInt();
			int x = s.nextInt();
			int y = s.nextInt();
			int z = s.nextInt();
			String res = (w == x || w == y || w == z || x + y == w || x + z == w || x + y + z == w || y + z == w)
					? "Yes"
					: "No";
			System.out.println(res);
		}
	}

}
