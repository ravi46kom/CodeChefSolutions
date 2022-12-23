package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Life_the_Universe_and_Everything {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N;
		 do {
			 N = sc.nextInt();
			 if(N != 42 && N> (-100) && N < 100) {
				 System.out.println(N);
			 }
			
		} while (N != 42 && N> (-100) && N < 100);

	}

}
