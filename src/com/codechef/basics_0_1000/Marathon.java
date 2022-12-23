package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Marathon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int D = sc.nextInt();
			int d = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if((D*d) >= 10 && (D*d)<21) {
				System.out.println(a);
			}else if ((D*d) >= 21 && (D*d)<42) {
				System.out.println(b);
			}
			else if((D*d) >= 42) {
				System.out.println(c);
			}else {
				System.out.println(0);
			}
		}
	}

}
