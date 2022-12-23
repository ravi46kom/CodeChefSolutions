package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Vaccine_Dates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int d = sc.nextInt();
			int l = sc.nextInt();
			int r = sc.nextInt();
			if (d <= r && d >= l) {
				System.out.println("Take second dose now");
			} else if (d > r) {
				System.out.println("Too Late");
			} else {
				System.out.println("Too Early");
			}
		}
	}

}
