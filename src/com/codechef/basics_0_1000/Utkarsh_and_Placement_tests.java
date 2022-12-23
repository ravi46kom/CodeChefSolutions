package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Utkarsh_and_Placement_tests {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			char pref_1 = sc.next().charAt(0);
			char pref_2 = sc.next().charAt(0);
			char pref_3 = sc.next().charAt(0);
			char com_1 = sc.next().charAt(0);
			char com_2 = sc.next().charAt(0);
			if(pref_1 == com_1 || pref_1 == com_2) {
				System.out.println(pref_1);
			}else if (pref_2 == com_1 || pref_2 == com_2) {
				System.out.println(pref_2);
			}else {
				System.out.println(pref_3);
			}
		}

	}

}
