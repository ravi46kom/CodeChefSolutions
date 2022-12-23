package com.codechef.Contest1399;

import java.util.Scanner;

public class Mileage_matters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			double n = sc.nextDouble();
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double diesel = (n / b) * y;
			double petrol = (n / a) * x;
			if (diesel < petrol) {
				System.out.println("DIESEL");
			} else if (diesel > petrol) {
				System.out.println("PETROL");
			} else {
				System.out.println("ANY");
			}

		}
	}

}
