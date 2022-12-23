package com.codechef.Contest1599;

import java.util.Scanner;
import java.util.Vector;

public class Sum_of_Cube {
	static final long modulo = 998244353;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			Vector<Integer> a = new Vector<Integer>();
			for (int i = 0; i < n; i++) {
				a.add(s.nextInt());
			}
			long total = 0;
			while (a.size() != 0) {
				int sum = 0;
				for (Integer integer : a) {
					sum += integer;
					total += Math.pow(sum, 3) % modulo;
					total %= modulo;

				}
				a.remove(0);
			}
			System.out.println(total);
		}

	}

}
