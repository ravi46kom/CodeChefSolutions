package com.demo;

public class AutoMataSeries {

	public static void main(String[] args) {
		int print = 1;
		for(int i = 1; i<10;i++) {
			for(int j = 1; j<=2*i; j++) {
				System.out.print(print+" ");
			}
			System.out.println();
		}
	}

}
