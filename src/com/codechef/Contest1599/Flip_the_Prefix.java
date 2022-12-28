package com.codechef.Contest1599;

import java.util.Scanner;

public class Flip_the_Prefix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t --> 0) {
			int n = s.nextInt();
			int k = s.nextInt();
			String str = s.next();
			int count = 0;
			int[] arr = new int[n];
			for(int i = 1; i<n; i++) {
				if(str.charAt(i) != str.charAt(i-1)) {
					count++;
					arr[i] = count;
				}else {
					arr[i] = count;
				}
			}
			int min = Integer.MAX_VALUE;
			arr[0] = 0;
			for(int i = n-1; i>= 0; i--) {
				if((i-(k-1))<0) {
					break;
				}
				int val = arr[i] - arr[i-(k-1)];
				if(str.charAt(i) == '0') {
					val++;
				}
				min = Math.min(val, min);
			}
			System.out.println(min);
			
			
		}
	}

}
