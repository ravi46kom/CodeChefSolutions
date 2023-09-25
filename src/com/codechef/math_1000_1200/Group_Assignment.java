package com.codechef.math_1000_1200;

import java.io.PrintStream;
import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Group_Assignment {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
				if (map.containsKey(arr[i])) {
					map.put(arr[i], map.get(arr[i]) + 1);
				} else {
					map.put(arr[i], 1);
				}
			}
			boolean flag = false;
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getValue() % entry.getKey() == 0) {
					flag = true;
				} else {
					flag = false;
					break;
				}

			}
			System.out.println(flag ? "Yes" : "No");
		}
	}

}
