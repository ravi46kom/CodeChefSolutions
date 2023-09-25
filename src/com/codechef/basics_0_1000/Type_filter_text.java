package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Type_filter_text {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int m = s.nextInt();
			System.out.println(n - (n / 10) > m ? "DINING" : (double)n - ((double)n / 10) < m  ? "ONLINE" : "EITHER");
		}
	}

}
