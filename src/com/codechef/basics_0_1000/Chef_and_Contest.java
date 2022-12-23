package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Chef_and_Contest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int p = sc.nextInt();
			int q = sc.nextInt();
			int chef = x + (10 * p);
			int chefina = y + (10 * q);
			if (chef < chefina) {
				System.out.println("Chef");
			} else if (chef > chefina) {
				System.out.println("Chefina");
			} else{
				System.out.println("Draw");
			}
		}
	}

}
