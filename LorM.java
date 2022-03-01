package main;
import java.util.*;

public class Largeorsmall {

	public static void main(String[] args) {
		int l,s,n,i;		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of elements : ");
		n=sc.nextInt();		
		int a[] = new int[n];
		System.out.println("Enter elements : ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}		
		l=s=a[0];
		for(i=0;i<n;++i)
		{
			if(a[i]>l)
				l=a[i];

			if(a[i]<s)
				s=a[i];
		}
		System.out.println(" Smallest number = " +s+" and Largest number = "+l);	
		// TODO Auto-generated method stub

	}

}
