package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Pawri_Meme {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t --> 0) {
			String str = s.next();
			System.out.println(str.replace("party", "pawri"));
		}
	}

}
