package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Total_Expenses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			double qnt = sc.nextInt();
			double price = sc.nextInt();
			if (qnt > 1000) {
				 price -= ((price * 10) / 100);
			}
			System.out.println(qnt*price);
		}
	}

}
