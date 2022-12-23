package com.codechef.Contest1599;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class XOR_with_smallest_element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			List<Integer> list = new ArrayList<Integer>();
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			for(int i = 0; i<n; i++) {
				list.add(sc.nextInt());
			}
			for(int i = 0; i<y; i++) {
				Collections.sort(list);
				list.set(0, list.get(0)^x);
			}
			Collections.sort(list);
			System.out.println(list);
			
		}
	}

}
