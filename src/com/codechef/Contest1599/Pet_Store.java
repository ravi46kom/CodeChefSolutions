package com.codechef.Contest1599;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pet_Store {
	static boolean countFreq(int arr[], int n) {
		Map<Integer, Integer> mp = new HashMap<>();
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			if (entry.getValue() % 2 != 0) {
				flag = false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}

			System.out.println(countFreq(a, n) ? "YES" : "NO");
		}
	}

}
