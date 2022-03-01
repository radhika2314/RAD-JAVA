package main;

import java.util.Scanner;

public class Frequent2nd {


	public static void main(String[] args) {
//		Scanner in= new Scanner(System.in);
//		System.out.println("Enter String : ");
//		String str=in.nextLine();		
//	    int max=0, max2=0;
//	    int ar[]=new int[256];
//	    for(int i=0;i<str.length();i++)
//	    {
//	    	if(str.charAt(i)!='')
//	    	  arr[str.charAt(i)]++;	    	
//	    }
		Scanner in=new Scanner(System.in);
		String str;
		System.out.println("Enter your String:");
		str=in.nextLine();
		
	    int i,max=0,sec_max=0;
	    int arr[]=new int[256];
	    for(i=0;i<str.length();i++)
	    {
	        if(str.charAt(i)!=' ')
	           arr[str.charAt(i)]++;
	    }
	    for (i = 0; i <256; i++) {
	        if (arr[i]>arr[max]) {
	                sec_max=max;
	                max = i;
	        }
	        else if(arr[i]>arr[sec_max] && arr[i]!=arr[max]){
	                sec_max=i;
	       }
	      }
	    System.out.print("The Second Most occurring character in a string is "+(char)(sec_max));
		 
            
		// TODO Auto-generated method stub

	}

}
