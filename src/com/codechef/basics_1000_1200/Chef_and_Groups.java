package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class Chef_and_Groups {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int count = 0;
			int group = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1') {
					count++;
				} else {
					if (count > 0) {
						group++;
					}
					count = 0;
				}
			}
			if(s.charAt(s.length()-1) == '1') {
				System.out.println(group+1);
			}else {
				System.out.println(group);
			}
			
		}
	}

}
