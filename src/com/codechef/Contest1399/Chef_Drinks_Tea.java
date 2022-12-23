package com.codechef.Contest1399;

import java.util.Scanner;

public class Chef_Drinks_Tea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			int n = 0;
			if (x <= y) {
				System.out.println(z);
			} else if(x>y) {
				if(x%y == 0) {
					n = x/y;
				}else {
					n = (x/y)+1;

				}
				System.out.println(n*z);

			}
		}
	}

}
