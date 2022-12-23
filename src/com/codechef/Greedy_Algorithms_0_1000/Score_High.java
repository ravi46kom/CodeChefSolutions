package com.codechef.Greedy_Algorithms_0_1000;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Score_High {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			while(t --> 0) {
				int n = sc.nextInt();
				int max = Integer.MIN_VALUE;
				List<Integer> list = new ArrayList<Integer>();
				for(int i = 0; i<4; i++) {
					list.add(sc.nextInt());
					if(max<list.get(i)) {
						max = list.get(i);
					}
				}
				System.out.println(max);
			}
		}
	}

}
