package com.codechef.basics_0_1000;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Non_Negative_Product {

	public static void main(String[] args) throws NullPointerException, InputMismatchException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int size = sc.nextInt();
			int[] A = new int[size];
			int count = 0;
			int element = 1;
			for (int i = 0; i < size; i++) {
				A[i] = sc.nextInt();
				if (A[i] < 0) {
					count++;
				}
				if (A[i] == 0) {
					element = 0;
				}
			}
			if (count % 2 == 0 || element == 0) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		}
	}

}
