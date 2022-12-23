package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Good_Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr = new int[7];
		while (t-- > 0) {
			int sunny = 0;
			int rainy = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				if (arr[i] == 0) {
					rainy++;
				} else {
					sunny++;
				}
			}
			if (sunny > rainy) {
				System.out.println("yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
