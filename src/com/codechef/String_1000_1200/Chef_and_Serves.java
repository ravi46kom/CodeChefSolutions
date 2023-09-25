package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Chef_and_Serves {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int p1 = s.nextInt();
			int p2 = s.nextInt();                                                                  
			int k = s.nextInt();
			System.out.println(((p1 + p2) % (2 * k) < k) ? "CHEF" : "COOK");
		}

	}

}
