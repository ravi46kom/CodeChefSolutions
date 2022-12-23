package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Decrement_OR_Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N % 4 == 0) {
			System.out.println(++N);
		} else {
			System.out.println(--N);
		}

	}

}
