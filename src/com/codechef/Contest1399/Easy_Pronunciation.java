package com.codechef.Contest1399;

import java.util.Scanner;

public class Easy_Pronunciation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int vcount = 0;
			int c_count = 0;
			int n = sc.nextInt();
			String str = sc.next().toLowerCase();
			for (int i = 0; i < n; i++) {
				if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
						|| str.charAt(i) == 'u') {
					vcount++;
					c_count = 0;
					
				} else {
					c_count++;
				}
				if(c_count == 4) {
					break;
				}
			}
			System.out.println(c_count >= 4 ? "No" : "Yes");

		}
	}

}
