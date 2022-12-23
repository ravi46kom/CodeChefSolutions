package com.codechef.Contest1599;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Not_Divisible {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			Set<Integer> a = new TreeSet<Integer>();
			for (int i = 0; i < n; i++) {
				a.add(s.nextInt());
			}
			for (Iterator iterator = a.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				for (Iterator iterator2 = a.iterator(); iterator2.hasNext();) {
					Integer integer2 = (Integer) iterator2.next();

				}
			}

		}
	}

}
