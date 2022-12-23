package com.codechef.Contest1399;

import java.util.ArrayList;
import java.util.Scanner;

public class Different_Medians {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			ArrayList<Integer> ar = new ArrayList<Integer>();
			int med = 2;
				med = n % 2 == 0 && n>2? n / 2 : (n / 2) + 1;
			ar.add(med);
			for (int i = 1; i <= n; i++) {
				if (ar.get(0) == i) {

				} else {
					ar.add(i);
				}
			}
			for(int i = 0; i<ar.size(); i++) {
				System.out.print(ar.get(i)+" ");
			}
			System.out.println();
		}
	}

}
