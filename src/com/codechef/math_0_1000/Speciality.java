package com.codechef.math_0_1000;

import java.util.Scanner;

public class Speciality {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			String result = (x > y && x > z) ? "Setter" : ((y > x && y > z) ? "Tester" : "Editorialist");
			System.out.println(result);
		}
	}

}
