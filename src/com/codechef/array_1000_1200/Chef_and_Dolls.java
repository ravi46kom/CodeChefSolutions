package com.codechef.array_1000_1200;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chef_and_Dolls {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
				if (map.containsKey(arr[i])) {
					map.put(arr[i], map.get(arr[i]) + 1);
				} else {
					map.put(arr[i], 1);
				}
			}

			int res = 0;
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getValue() % 2 != 0) {
					res = entry.getKey();
					break;
				}
			}
			System.out.println(res);

		}
	}

}
