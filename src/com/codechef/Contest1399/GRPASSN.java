package com.codechef.Contest1399;

import java.util.Arrays;
import java.util.Scanner;

public class GRPASSN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
//			int n = sc.nextInt();
//			int[] arr = new int[n];
//			for(int i = 0; i<n; i++) {
//				arr[i] = sc.nextInt();
			
			
			int n = sc.nextInt();
			String str =sc.next();
			StringBuilder str1 = new StringBuilder(str);
			for(int i = 0; i<n; i++) {
				if(str1.charAt(i)== 'a' || str1.charAt(i)== 'e'||str1.charAt(i)== 'i'||str1.charAt(i)== 'o'||str1.charAt(i)== 'u') {
					str1.reverse();
					
				}
			}
			System.out.println(str1);

		}
	}

}
