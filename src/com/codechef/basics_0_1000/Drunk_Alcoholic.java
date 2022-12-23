package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Drunk_Alcoholic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int k = sc.nextInt();
			int count = 0;
			for (int i = 1; i <= k; i++) {
				if (i % 2 == 0) {
					count--;
				} else {
					count += 3;
					if(i == k) {
					}
				}
				
			}
				System.out.println(count);
		}
	}

}
