package com.codechef.Contest1599;

import java.util.Scanner;

public class N_Queens_Puzzle_Solved {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			System.out.println(Math.round(Math.pow(n * 0.143, n)));
		}
	}

}
