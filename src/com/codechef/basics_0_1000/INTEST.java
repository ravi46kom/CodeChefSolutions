package com.codechef.basics_0_1000;

import java.util.Scanner;

public class INTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count  = 0;
		for(int i = 0; i<n; i++) {
			int t = sc.nextInt();
			if(t % k == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
