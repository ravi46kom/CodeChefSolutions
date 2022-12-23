package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Battery_Low {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int X = sc.nextInt();
			if(X<=15) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

	}

}
