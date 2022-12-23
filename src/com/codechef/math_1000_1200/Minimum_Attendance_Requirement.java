package com.codechef.math_1000_1200;

import java.util.Scanner;

public class Minimum_Attendance_Requirement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			String str = s.next();
			str = str.replace("0", "");
			System.out.println(str.length() + (120 - n) >= 90 ? "YES" : "NO");
			
		}
	}

}
