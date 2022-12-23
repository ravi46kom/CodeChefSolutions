package com.codechef.math_0_1000;

import java.util.Scanner;

public class Building_Race {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int x = s.nextInt();
			int y = s.nextInt();
			double chef = (double) a / x;
			double chefina = (double) b / y;
			String res = chef == chefina ? "Both" : chef < chefina ? "Chef" : "Chefina";
			System.out.println(res);
		}
	}

}
