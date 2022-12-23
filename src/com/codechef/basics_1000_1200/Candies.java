package com.codechef.basics_1000_1200;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Candies {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[2 * n];
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < 2 * n; i++) {
				a[i] = s.nextInt();
				if (map.containsKey(a[i])) {
					map.put(a[i], map.get(a[i]) + 1);
				} else {
					map.put(a[i], 1);
				}
			}
			Boolean flag = true;
			for (Map.Entry entry : map.entrySet()) {
				int val = (int) entry.getValue();
				if (val > 2) {
					flag = false;
					break;
				}

			}
			System.out.println(flag ? "Yes" : "No");

		}
	}

}
