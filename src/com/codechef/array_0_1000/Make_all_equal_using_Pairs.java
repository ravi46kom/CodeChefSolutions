package com.codechef.array_0_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Make_all_equal_using_Pairs {

//	public static int frequency(int[] arr, int size) {
//		Arrays.sort(arr);
//		int count = 1;
//		int max_count = 1;
//		for (int i = 1; i < size; i++) {
//			if (arr[i] == arr[i - 1]) {
//				count++;
//			}
//			if (arr[i] != arr[i - 1] || i == size - 1) {
//				if (count > max_count) {
//					max_count = count;
//					count = 1;
//				}
//			}
//		}
//
//		return max_count;
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int maxCount = 0;
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
//			count = frequency(arr, arr.length);
//			System.out.println(n-count);
			for (int i = 0; i < n; i++) {
				int count = 0;
				for (int j = 0; j < n; j++) {
					if (arr[i] == arr[j]) {
						count++;
					}
				}
				if (maxCount < count) {
					maxCount = count;
				}

			}
			System.out.println(n-maxCount);
		}
	}

}
