package com.codechef.Contest1399;

import java.util.Scanner;

public class Hungry_Chef {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int n = sc.nextInt();
			int r = sc.nextInt();
			if(r/y >= n) {
				System.out.println(0+" "+n);
			}else if (r/x < n) {
				System.out.println(-1);
			}else {
				int res = (r-(y*n))/(x-y);
				if((r-(y*n))%(x-y)!=0) {
					res += 1;
				}
				System.out.println(res+" "+(n-res));
			}
		}
	}

}
