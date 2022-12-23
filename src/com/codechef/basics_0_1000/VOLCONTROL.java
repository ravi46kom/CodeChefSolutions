package com.codechef.basics_0_1000;

import java.util.Scanner;

public class VOLCONTROL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int x=0, y = 0;
		for(int i = 0; i<cases; i++) {
//			int result = 0;
			x = sc.nextInt();
			y = sc.nextInt();
			if(x<y) {
				System.out.println(y-x);
			}else if(x-y == 0) {
				System.out.println(0);
			}else {
				System.out.println(x-y);
			}
			
		}

	}

}
