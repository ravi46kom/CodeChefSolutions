package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Puppy_and_Sum {
	public static void sum(int d, int n) {
		while(d --> 0) {
			int sum = 0;
		for(int i = 1; i<=n; i++) {
			sum += i;
		}
		n= sum;
		}
		System.out.println(n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0){
			int d = sc.nextInt();
			int n = sc.nextInt();
			sum(d, n);
		}
	}

}
