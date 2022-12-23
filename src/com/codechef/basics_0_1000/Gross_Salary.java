package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Gross_Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int bs = sc.nextInt();
			double hra, da, gs;

			if (bs >= 1500) {
				hra = 500;
				da = (float)(bs * 98) / 100;

			} else {
				hra = (float) (bs * 10) / 100;
				da = (float) (bs * 90) / 100;
			}
			gs = bs+hra+da;
			System.out.println(String.format("%.2f", gs));
		}

	}

}
