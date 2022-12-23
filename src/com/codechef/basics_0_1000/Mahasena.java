package com.codechef.basics_0_1000;

import java.util.Scanner;

public class Mahasena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int even = 0;
		int odd = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		if (even > odd) {
			System.out.println("Ready for Battle");
		} else {
			System.out.println("Not Ready");

		}
	}

}
