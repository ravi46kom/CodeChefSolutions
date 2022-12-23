package com.codechef.Contest1399;

import java.util.Scanner;

public class Pass_the_Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int total = a + b + c;
			if (total >= 100 && a >= 10 && b >= 10 && c >= 10) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		}
	}

}
