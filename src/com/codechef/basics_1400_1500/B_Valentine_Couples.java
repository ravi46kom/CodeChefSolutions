package com.codechef.basics_1400_1500;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B_Valentine_Couples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int n = sc.nextInt();
			int[] b = new int[n];
			for(int i = 0; i<n; i++) {
				b[i] = sc.nextInt();			
			}
			Integer[] g = new Integer[n];
			for(int i = 0; i<n; i++) {
				g[i] = sc.nextInt();
			}
		Arrays.sort(b);
		Arrays.sort(g, Collections.reverseOrder());
		int val1 = (b[0] + g[g.length - 1]);
		int val2 = (b[b.length - 1] + g[0]);
		int likeness =  val1 >= val2 ? val1 : val2;
		System.out.println(likeness);
		}
	}

}
