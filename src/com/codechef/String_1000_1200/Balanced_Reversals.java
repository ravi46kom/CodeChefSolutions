package com.codechef.String_1000_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Balanced_Reversals {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t --> 0) {
			int n = s.nextInt();
			char[] ch = s.next().toCharArray();
			Arrays.sort(ch);
			StringBuilder result = new StringBuilder();
			result.append(ch);
			System.out.println(result.toString());	
		}
	}

}
