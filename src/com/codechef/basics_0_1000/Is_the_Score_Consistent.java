package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Is_the_Score_Consistent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();

			if (C >= A && D >= B) {
				System.out.println("POSSIBLE");
			} else {
				System.out.println("IMPOSSIBLE");
			}
		}

	}

}
