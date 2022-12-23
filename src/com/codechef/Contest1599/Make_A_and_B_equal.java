package com.codechef.Contest1599;

import java.util.Scanner;

public class Make_A_and_B_equal {
	static String equal(int num1, int num2) {
		String s = "YES";
		if(num1>num2 && num1%2 == 0) {
			return equal(num1/2, num2);
		}else if(num1 != num2) {
			s = "NO";
		}
		return s;
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == b ) {
				System.out.println("YES");
			}else if (Math.max(a, b)%2 != 0) {
				System.out.println("NO");
			}else {
				System.out.println(equal(Math.max(a, b), Math.min(a, b)));
			}
		}
	}

}
