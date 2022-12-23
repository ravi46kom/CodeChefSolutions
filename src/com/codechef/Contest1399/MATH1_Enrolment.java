package com.codechef.Contest1399;

import java.util.Scanner;

public class MATH1_Enrolment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x>=y) {
				System.out.println(0);
			}else if(x<y) {
				System.out.println(y-x);
			}
		}
	}

}
