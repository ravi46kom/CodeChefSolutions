package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Cabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int val1;
		int val2 ;
		
		for(int i = 0; i<cases; i++) {
			val1 = sc.nextInt();
			val2 = sc.nextInt();
			if (val1 < val2) {
				System.out.println("FIRST");
			} else if (val1 > val2) {
				System.out.println("SECOND");
			} else {
				System.out.println("ANY");
			}
		}
		

		

	}

}
