package com.codechef.Contest1599;

import java.util.Scanner;

public class Reach_fast {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int x = s.nextInt();
			int y = s.nextInt();
			int k = s.nextInt();
			System.out.println(Math.abs(x - y) % k == 0 ? Math.abs(x - y) / k : (Math.abs(x - y) / k) + 1);
		}
	}

}
