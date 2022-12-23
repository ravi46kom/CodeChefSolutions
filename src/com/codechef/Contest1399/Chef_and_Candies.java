package com.codechef.Contest1399;

import java.util.Scanner;

public class Chef_and_Candies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int count = 0;
			if(n<=x) {
				System.out.println(0);
			}else if (n>x) {
				while(n>x) {
					x += 4;
					count++;
				}
				System.out.println(count);
			}
		}
	}

}
