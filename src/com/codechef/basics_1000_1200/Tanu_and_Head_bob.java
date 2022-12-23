package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class Tanu_and_Head_bob {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			String str = s.next();
			System.out.println(str.contains("I") ? "INDIAN" : str.contains("Y") ? "NOT INDIAN" : "NOT SURE");
		}
	}

}
