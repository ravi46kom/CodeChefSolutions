package com.codechef.math_1000_1200;

import java.util.Arrays;
import java.util.Scanner;

public class Devu_and_an_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n=s.nextInt();
		int q=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<q;i++)
		{
			int t=s.nextInt();
		    if(t<=a[n-1] && t>=a[0])
		    {
		        System.out.println("Yes");
		    }
		    else
		    System.out.println("No");
		}
	}

}
