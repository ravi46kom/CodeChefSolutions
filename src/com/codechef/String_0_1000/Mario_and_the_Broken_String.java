package com.codechef.String_0_1000;

import java.util.Scanner;

public class Mario_and_the_Broken_String {
	public static String isSame(String S, int len) {
		String A = "";
		String B = "";
		for(int i = 0; i<len; i++) {
			if(i <len/2) {
				A += S.charAt(i);
			}else {
				B += S.charAt(i);
			}
		}
		if(S.equals(B+A)) {
			return "Yes";
		}else {
			return "NO";
		}
	}

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int n = sc.nextInt();
			String s = sc.next();
			System.out.println(isSame(s, n));
		}
	}

}
