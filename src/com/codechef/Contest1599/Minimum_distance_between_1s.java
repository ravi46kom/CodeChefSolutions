package com.codechef.Contest1599;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Minimum_distance_between_1s {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			String str = s.next();
			boolean flag = false;
			Stack<Character> stack = new Stack<Character>();
			for (int i = 0; i < n; i++) {
				if (!stack.empty()) {
					if (str.charAt(i) == '1' && stack.peek() == '1') {
						flag = true;
						break;
					} else if (str.charAt(i) == '0' && stack.peek() == '0') {
						stack.pop();
					} else {
						stack.push(str.charAt(i));
					}
				}else {
					stack.push(str.charAt(i));
				}
				

			}
			if (flag) {
				System.out.println(1);
			} else {
				System.out.println(2);
			}

		}
	}

}
