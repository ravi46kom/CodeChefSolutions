package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Credit_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		if(X <= 1000 && X>=0) {
			if(X >749) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else {
			System.out.println("Plese Enter value bw 0 to 1000.");
		}
		

	}

}
