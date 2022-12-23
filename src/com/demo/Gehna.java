package com.demo;

import java.util.Scanner;

public class Gehna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		int[] arr = new int[size];
//		for (int i = 0; i < size; ++i) {
//			arr[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < size; ++i) {
//			arr[i] -= arr[i - 1];
//			arr[i - 1] = 0;
//		}
//
//		for (int i = 0; i < size; ++i) {
//			System.out.println(arr[i]);
//			}
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int count = 0;
			for (int i = 2; i <= Math.sqrt(x); i++) {
				if (x % i == 0) {
					count++;
				}
			}
			System.out.println(count == 0 ? "prime" : "Not Prime");
		}
	}

}
