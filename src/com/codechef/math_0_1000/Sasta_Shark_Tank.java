package com.codechef.math_0_1000;

import java.util.Scanner;

public class Sasta_Shark_Tank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			int a = (sc.nextInt()*100)/10;
			int b = (sc.nextInt()*100)/20;
			
			String res = (a>b)? "FIRST":(b>a ? "SECOND":"ANY");
			System.out.println(res);
			
		}
	}

}
