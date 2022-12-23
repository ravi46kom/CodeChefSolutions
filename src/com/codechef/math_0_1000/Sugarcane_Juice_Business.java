package com.codechef.math_0_1000;

import java.util.Scanner;

public class Sugarcane_Juice_Business {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t -- > 0) {
			Double n = sc.nextDouble()*50;
			Double res = (n - (n * 70) / 100);
			System.out.println(String.format("%.0f", res));
		}
	}

}
