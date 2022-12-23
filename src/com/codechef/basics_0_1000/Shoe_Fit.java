package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Shoe_Fit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if((a+b+c) >0 && (a+b+c)<3) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}

}
