package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Course_Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			if(m >= (n+k)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

	}

}
