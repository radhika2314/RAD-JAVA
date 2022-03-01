package main;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=in.nextInt();
		int fact=1;
//		for(int i=2; i<=n;i++)
//		{
//			fact=fact*i;
//		}
		
		int i=2;
		while(i<=n)
		{
			fact=fact*i;
			i++;		
		}
		
		System.out.println("Factorial of "+n+" = "+fact);		
		
		// TODO Auto-generated method stub

	}

}
