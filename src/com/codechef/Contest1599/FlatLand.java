package com.codechef.Contest1599;

import java.util.Scanner;

public class FlatLand {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int lastSquare = 0;
			int count = 0;
			while (n != 0) {
				lastSquare = (int) Math.sqrt(n);
				n -= lastSquare * lastSquare;
				count++;
			}

			System.out.println(count);
		}
	}

}
