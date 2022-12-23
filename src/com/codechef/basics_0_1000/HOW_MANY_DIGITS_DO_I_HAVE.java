package com.codechef.basics_0_1000;

import java.util.Scanner;

public class HOW_MANY_DIGITS_DO_I_HAVE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n >= 0 && n<=9) {
			System.out.println(1);
		}else if (n> 9 && n<100) {
			System.out.println(2);
		}else if (n>99 && n<1000) {
			System.out.println(3);
		}else if (n>1000) {
			System.out.println("More than 3 digits");
		}
	}

}
