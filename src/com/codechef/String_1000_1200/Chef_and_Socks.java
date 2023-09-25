package com.codechef.String_1000_1200;

import java.util.Scanner;

public class Chef_and_Socks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int jacketCost = s.nextInt();
		int sockCost = s.nextInt();
		int money = s.nextInt();
		int val = money - jacketCost;
		System.out.println(((sockCost >= val) || (val / sockCost) % 2 != 0) ? "Unlucky Chef" : "Lucky Chef");
	}

}
