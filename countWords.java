package main;

import java.util.Scanner;

public class Countwords {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter String :");
		String str=in.nextLine();
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Number of words = "+count);
		// TODO Auto-generated method stub

	}

}
