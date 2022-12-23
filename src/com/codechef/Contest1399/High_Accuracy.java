package com.codechef.Contest1399;

import java.util.Scanner;

public class High_Accuracy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int x = sc.nextInt();
			int div = x/3;
			if(x%3 == 0 || x == 0) {
				System.out.println(0);
			}
			if(div*3 < x) {
				div = (div+1)*3;
			}
			System.out.println(div);
		}
	}

}
