package com.codechef.math_0_1000;

import java.util.Scanner;

public class Factorial {
	static int Z(int n, int x, int res) {
		if(n>=x) {
			res += n/x;
			return  Z(n, x*5, res);
		}
			
		return res;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(Z(n, 5, 0));
		}
	}

}
