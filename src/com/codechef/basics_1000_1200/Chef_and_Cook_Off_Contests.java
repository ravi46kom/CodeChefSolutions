package com.codechef.basics_1000_1200;

import java.util.Scanner;

public class Chef_and_Cook_Off_Contests {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int count = 0;
			String[] str = new String[n];
			int cakewalk = 0;
			int simple = 0;
			int easy = 0;
			int easy_medium = 0;
			int medium = 0;
			int medium_hard = 0;
			int hard = 0;
			for (int i = 0; i < n; i++) {
				str[i] = s.next();
				if (str[i].equals("cakewalk")) {
					cakewalk = 1;
				} else if (str[i].equals("simple")) {
					simple = 1;
				} else if (str[i].equals("easy")) {
					easy = 1;
				} else if (str[i].equals("easy-medium")) {
					easy_medium = 1;
				} else if (str[i].equals("medium")) {
					medium = 1;
				} else if (str[i].equals("medium-hard")) {
					medium_hard = 1;
				} else if (str[i].equals("hard")) {
					hard = 1;
				}
			}
			if (cakewalk != 0 && simple != 0 && easy != 0 && (easy_medium != 0 || medium != 0)
					&& (hard != 0 || medium_hard != 0)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
