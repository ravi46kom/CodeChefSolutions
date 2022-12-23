package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Sort_the_String {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			String str = s.next();
			int cnt = 0;
			for (int i = 1; i < n; i++) {
				int a =(str.charAt(i-1)-'0')*10 + (str.charAt(i)-'0');
				if(a == 10) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}
