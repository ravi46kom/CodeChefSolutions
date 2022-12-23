package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Chef_and_Races {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int count;
		while (t-- > 0) {
			count = 0;
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			if(X == A || X == B) {
				count++;
			}
			if (Y == A || Y == B) {
				count++;
			}
			System.out.println(2-count);
		}
	}

}
