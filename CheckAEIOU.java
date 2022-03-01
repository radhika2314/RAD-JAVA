package main;

import java.util.Scanner;


public class Vowelorconsonant {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a character");
		char a=in.next().charAt(0);
//		if(a>='A'&&a<='Z'||a>='a'&&a<='z')
//		{
//				if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
//				{	System.out.println(a+" Is a vowel");		
//				}				
//				else
//				{ 
//					System.out.println(a+" Is a consonant");
//				}
//		}
//		else
//		{
//			System.out.println(a+" Is not an alphabet");
//		}
		
		switch(a)
		{ 
		 case 'a':
		 case 'A':	 
		 case 'E':
		 case 'e':
		 case 'I':
		 case 'i':
		 case 'O':
		 case 'o':
		 case 'U':
		 case 'u':
			 System.out.println(a+" Is a vowel");
			 break;
		 default:
			 if(a>='A'&&a<='Z'||a>='a'&&a<='z')
			 {
			 	System.out.println(a+" Is a consonant");
			 }
			 else
			 { 
				 System.out.println(a+" Is not an alphabet");
			 }
				 
			 break;
		}
		
		
		// TODO Auto-generated method stub

	}

}
