package com.codechef.Contest1399;

import java.util.Scanner;

public class Chess_Time {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int n = sc.nextInt();
			System.out.println((60*n)/20);
		}
	}

}
