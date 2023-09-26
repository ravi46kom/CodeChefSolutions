package com.codechef.array_0_1000;

import java.util.Scanner;

public class Chef_and_Chocolates {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t --> 0) {
			int x = 5*(s.nextInt());
			int y = 10*(s.nextInt());
			int z = s.nextInt();
			System.out.println((x+y)/z);
			
		}
	}

}
