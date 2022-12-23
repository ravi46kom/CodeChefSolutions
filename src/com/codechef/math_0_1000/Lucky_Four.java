package com.codechef.math_0_1000;

import java.util.Scanner;

public class Lucky_Four {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int n= sc.nextInt();
			int count = 0;
			while(n != 0) {
				int rem = n%10;
				n /= 10;
				if(rem == 4) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
