package com.codechef.Data_Structures_0_1000;

import java.util.Scanner;
import java.util.Stack;

public class Transform_the_Expression {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			while (t-- > 0) {
			
				String str = sc.next();
				Stack<Character> stack = new Stack<Character>();
				String result = "";
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
						result += str.charAt(i);
					} else if (str.charAt(i) == ')') {
						while (stack.peek() != '(') {
							result += stack.peek();
							stack.pop();
						}
						stack.pop();
					} else {
						stack.push(str.charAt(i));
					}
				}
				System.out.println(result);

			}
		}
	}

}
