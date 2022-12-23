package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Id_and_Ship {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			char ch = sc.next().charAt(0);
			if (ch == 'B' || ch == 'b') {
				System.out.println("BattleShip");
			} else if (ch == 'c' || ch == 'C') {
				System.out.println("Cruiser");
			} else if (ch == 'D' || ch == 'd') {
				System.out.println("Destroyer");
			} else if (ch == 'f' || ch == 'F') {
				System.out.println("Frigate");
			}
		}
	}

}
