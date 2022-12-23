package com.codechef.Greedy_Algorithms_0_1000;

import java.util.Scanner;

public class Bomb_the_base {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int[] a = new int[n];
			int count = 0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for(int i = n-1; i>=0; i--) {
				if(a[i] < x) {
					count = i+1;
					break;
				}
			}
			System.out.println(count);
		}
	}

}
