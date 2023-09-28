package com.codechef.array_0_1000;

import java.util.Scanner;

public class Who_is_taller {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t --> 0) {
			System.out.println(s.nextInt() > s.nextInt() ? 'A' : 'B');
		}
	}

}
