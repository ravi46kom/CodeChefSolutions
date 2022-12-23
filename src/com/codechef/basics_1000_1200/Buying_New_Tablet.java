package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class Buying_New_Tablet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int b = s.nextInt();
			int max = 0;
			while (n != 0) {
				int w = s.nextInt();
				int h = s.nextInt();
				int p = s.nextInt();
				if (p <= b) {
					max = Math.max(max, w * h);
				}
				n--;
			}
			System.out.println(max > 0 ? max : "no tablet");
		}
	}

}
