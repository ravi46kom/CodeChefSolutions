package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class How_much_Scholarship {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int res = (r > 0 && r <= 50) ? 100 : (r > 50 && r <= 100) ? 50 : 0;
		System.out.println(res);
	}

}
