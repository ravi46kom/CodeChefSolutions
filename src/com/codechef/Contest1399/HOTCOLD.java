package com.codechef.Contest1399;

import java.util.Scanner;

public class HOTCOLD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int c = sc.nextInt();
			System.out.println(c>20?"HOT":"COLD");
		}
	}

}
