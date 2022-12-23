package com.codechef.Contest1399;

import java.util.Scanner;

public class Similar_Heights {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] h = new int[n];
			boolean flag; 
			int count = 0;
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextInt();
			}
			for(int i=0;i<n;i++) {
		        flag = false;
		        for(int j=0;j<n;j++) {
		            if(i!=j && h[i] == h[j]) {
		                flag = true;//to check if for current picked elements is repeating element
		                break;
		            }
		        }
		        //since flag is false only when no repeating element has occurred while traversal and reached the end of the array.
		        if(!flag) {
		        	count++;
		        }
		    }
			int res = count/2 == 0? count/2:((count/2!=0)? (count+1)/2:0);
			if(count == 1) {
				res = 1;
			}
			System.out.println(res);
		}
	}

}
