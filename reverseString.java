package main;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter string");
		String s=in.nextLine();
		String rev="";
		char c;
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			rev=c+rev;
		}
		System.out.println("Reversed string : "+rev);
		// TODO Auto-generated method stub

	}

}
