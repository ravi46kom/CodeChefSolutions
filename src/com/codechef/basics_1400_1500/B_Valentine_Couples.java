package com.codechef.basics_1400_1500;

import java.util.Scanner;

public class B_Valentine_Couples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int n = sc.nextInt();
			int[] b = new int[n];
			int gmin = Integer.MAX_VALUE;
			int bmin = Integer.MAX_VALUE;
			int gmax = Integer.MIN_VALUE;
			int bmax = Integer.MIN_VALUE;
			for(int i = 0; i<n; i++) {
				b[i] = sc.nextInt();
				
			}
			int[] g = new int[n];
			for(int i = 0; i<n; i++) {
				g[i] = sc.nextInt();
			}
		
		}
	}

}
