package com.codechef.Contest1399;

import java.util.Scanner;

public class The_Last_Levels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			System.out.println(x<=3?x*y:((x%3 == 0)?x*y+((x/3)-1)*z:x*y+(x/3)*z));
		}
	}

}
