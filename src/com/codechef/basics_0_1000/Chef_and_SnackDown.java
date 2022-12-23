package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Chef_and_SnackDown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr = { 2010, 2015, 2016, 2017, 2019 };
		while (t-- > 0) {
			int len = arr.length;
			int year = sc.nextInt();
			boolean flag = false;
			while (len-- > 0) {
				if (arr[len] == year) {
					flag = true;
					break;
				}
			}
			if (flag == true) {
				System.out.println("HOSTED");
			} else {
				System.out.println("NOT HOSTED");
			}
		}
	}
}
