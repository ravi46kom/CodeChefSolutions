package com.codechef.math_0_1000;

import java.util.Scanner;

public class Joining_Date {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int total_grp = 0;
			if(n%5==0) {
				total_grp = n/5;
			}else {
				total_grp = (n/5)+1;
			}
			int grp_no = 0;
			if(k%5==0) {
				grp_no = k/5;
			}else {
				grp_no = (k/5)+1;
			}
			if(total_grp>grp_no) {
				System.out.println(total_grp-grp_no);
			}else {
				System.out.println(0);
			}
		}
	}
}
