package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Janmansh_and_Games {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t  = sc.nextInt();
		while(t--> 0) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			if((X+Y)%2 == 0) {
				System.out.println("Janmansh");
			}else {
				System.out.println("Jay");
			}
		}

	}

}
