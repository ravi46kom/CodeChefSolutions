package com.codechef.array_1000_1200;

import java.util.Hashtable;
import java.util.Scanner;

public class Devu_and_friendship_testing {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			Hashtable<Integer, Integer> map = new Hashtable<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
				if (map.containsKey(a[i])) {
					map.put(a[i], map.get(a[i]) + 1);
				} else {
					map.put(a[i], 1);
				}
			}
			System.out.println(map.size());
		}
	}

}
