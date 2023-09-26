package com.codechef.array_0_1000;

import java.util.Scanner;

public class Scalene_Triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t --> 0) {
			int x = s.nextInt();
			int y = s.nextInt();
			int z = s.nextInt();
			System.out.println(x != y && y != z && x != z ? "YES" : "NO");
		}
	}

}
