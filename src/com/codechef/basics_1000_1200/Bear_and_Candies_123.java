package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class Bear_and_Candies_123 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int i = 0;
			int limak = 0;
			int bob = 0;
			while (limak <= a && bob <= b) {
				i += 1;
				limak += i;
				i += 1;
				bob += i;
			}
			if ((limak > a && bob > b) || (limak > a)) {
				System.out.println("Bob");
			} else {
				System.out.println("Limak");
			}
		}
	}

}
