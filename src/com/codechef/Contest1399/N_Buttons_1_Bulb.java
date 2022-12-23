package com.codechef.Contest1399;

import java.util.Scanner;

public class N_Buttons_1_Bulb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int n = sc.nextInt();
			String s = sc.next();
			String r = sc.next();
			int sum = 0;
			for(int i = 0; i<n; i++) {
				sum += s.charAt(i)+r.charAt(i);
			}
			System.out.println(sum%2 == 0?1:0);
		}
	}

}
