package com.codechef.array_1000_1200;

import java.util.Scanner;

public class Testing_Robot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int x = s.nextInt();
			String str = s.next();
			int[] arr = new int[str.length() + 1];
			arr[0] = x;
			int min = x;
			int max = x;
			for (int i = 0; i < n; i++) {
				if (str.charAt(i) == 'R') {
					arr[i + 1] = arr[i] + 1;
					max = Math.max(max, arr[i + 1]);
				} else {
					arr[i + 1] = arr[i] - 1;
					min = Math.min(min, arr[i + 1]);

				}
			}
			System.out.println(max - min + 1);
		}
	}

}
