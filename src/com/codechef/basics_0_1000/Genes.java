package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Genes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char char1 = sc.next().charAt(0);
		char char2 = sc.next().charAt(0);

		if (char1 == 'R' || char2 == 'R') {
			System.out.println("R");
		} else if (char1 == 'B' || char2 == 'B') {
			System.out.println('B');
		} else {
			System.out.println('G');
		}
	}

}
