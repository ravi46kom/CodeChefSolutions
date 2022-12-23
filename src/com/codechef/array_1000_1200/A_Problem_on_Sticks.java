package com.codechef.array_1000_1200;

import java.util.HashSet;
import java.util.Scanner;

public class A_Problem_on_Sticks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			long n = s.nextInt();
			HashSet<Integer> a = new HashSet<Integer>();
			for (int i = 0; i < n; i++) {
				a.add(s.nextInt());
			}
			a.remove(0);
			System.out.println(a.size());
		}
	}

}
