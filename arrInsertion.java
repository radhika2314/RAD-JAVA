package main;

import java.util.Scanner;

public class Arrayinsertion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[]=new int[] {1,2,3,4,5};
		System.out.println("Enter elemnt to add :");
		int add=in.nextInt();
		System.out.println("Enter position to add :");
		int pos=in.nextInt();
		int new_arr[]=new int[6];
		for(int i=0;i<6;i++)
		{
			if(i<pos-1)
			{
				new_arr[i]=a[i];
			}
			else if(i==pos-1)
			{
				new_arr[i]=add;
			}
			else
			{
				new_arr[i]=a[i-1];
			}
		}
		System.out.println("New Array : ");
		for(int i=0;i<6;i++)
		{
				System.out.print(new_arr[i]+" "); 
		}
		// TODO Auto-generated method stub

	}

}
