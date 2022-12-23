package com.codechef.String_0_1000;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Good_Binary_Strings {
	

	public static void main(String[] args) throws NullPointerException, InputMismatchException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t -->0) {
			String S = sc.next();
			if(S.charAt(0) == S.charAt(S.length()-1)) {
				System.out.println(S.length()-2);
			}else {
				System.out.println(2);
			}
		}

	}

}
