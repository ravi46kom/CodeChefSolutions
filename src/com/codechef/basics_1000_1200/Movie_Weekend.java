package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class Movie_Weekend {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] l = new int[n];
			int[] r = new int[n];
			int max = 0, index = 0, rat = 0;
			for (int i = 0; i < n; i++)
				l[i] = sc.nextInt();

			for (int j = 0; j < n; j++) {
				r[j] = sc.nextInt();
				int pick = l[j] * r[j];
				if (pick > max) {
					max = pick;
					index = j;
					rat = r[j];
				}
			}
			for (int k = 0; k < n; k++) {
				int q = l[k] * r[k];
				if (k == index)
					continue;
				else {
					if (q == max) {
						if (rat < r[k]) {
							rat = r[k];
							index = k;
						}
					}
				}
			}
			System.out.println((index + 1));
		}
	}

}
