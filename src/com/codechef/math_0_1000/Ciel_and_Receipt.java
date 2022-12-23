package com.codechef.math_0_1000;

import java.util.Scanner;

public class Ciel_and_Receipt {
	static int menu(int n, int count, int price) {
		if (n == 0 || price == 0) {
			return count;

		} else if (n >= price) {
			count += n / price;
			n %= price;
			price /= 2;
			return menu(n, count, price);
		} else if (n < price) {
			return menu(n, count, price / 2);

		}else {
			return count;

		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int p = sc.nextInt();
			System.out.println(menu(p, 0, 2048));

		}
	}

}
