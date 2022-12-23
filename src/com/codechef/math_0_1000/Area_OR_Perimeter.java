package com.codechef.math_0_1000;

import java.util.Scanner;

public class Area_OR_Perimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		int ar = l * b;
		int per = 2 * (l + b);
		if (ar > per) {
			System.out.println("Area\n" + ar);
		} else if (per > ar) {
			System.out.println("Peri\n" + per);
		} else {
			System.out.println("Eq\n" + ar);
		}
	}

}
