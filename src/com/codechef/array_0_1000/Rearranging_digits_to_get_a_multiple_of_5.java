package com.codechef.array_0_1000;

import java.util.Scanner;

public class Rearranging_digits_to_get_a_multiple_of_5 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while (t-- > 0) {
				int flag = 0;
				int d = sc.nextInt();
				String n = sc.next();
				for (int i = 0; i < d; i++) {
					if (n.charAt(i) == '5' || n.charAt(i) == '0') {
						flag = 1;
					}
				}
				if (flag == 1) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
	}

}
