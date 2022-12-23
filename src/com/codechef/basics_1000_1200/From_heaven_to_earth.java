package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class From_heaven_to_earth {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while( t--> 0) {
			int n = s.nextInt();
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			double disUsingStairs = (double)n * Math.sqrt(2);
			System.out.println(disUsingStairs * v1 < n * v2 ? "Elevator" : "Stairs") ;
		}
	}

}
