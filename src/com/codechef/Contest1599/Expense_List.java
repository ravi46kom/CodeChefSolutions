package com.codechef.Contest1599;

import java.util.Scanner;

public class Expense_List {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t --> 0) {
			int n = s.nextInt();
			int x = s.nextInt();
			long income = (long)(Math.pow(2, x)/Math.pow(2, n));
			System.out.println(income);
			
		}
	}

}
