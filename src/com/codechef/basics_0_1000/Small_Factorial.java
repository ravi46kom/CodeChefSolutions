package com.codechef.basics_0_1000;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Small_Factorial {

	public static int fact(int N) {
		if (N <=1) {
			return 1;
		}else {
			return N * fact(N - 1);
		}
		

	}

	public static void main(String[] args) throws NoSuchElementException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int N = sc.nextInt();
			System.out.println(Small_Factorial.fact(N));
		}

	}

}
