package main;
import java.util.*;

public class Matrixaddition {

	public static void main(String[] args) {
		int i,j,r,c;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows and coloumns");
		r = in.nextInt();
		c = in.nextInt();
		int a[][] = new int[r][c];
		int b[][] = new int[r][c];
		int s[][] = new int[r][c];
		System.out.println("Enter elements of 1st matrix :");
		for(i=0;i<r;i++)
		{	for(j=0;j<c;j++)
			{	a[i][j]=in.nextInt();
			
			}
		}
		System.out.println("Enter elements of 2nd matrix :");
		for(i=0;i<r;i++)
		{	for(j=0;j<c;j++)
			{	b[i][j]=in.nextInt();
			
			}
		}		
		for(i=0;i<r;i++)
		{	for(j=0;j<c;j++)
			{	s[i][j]=a[i][j]+b[i][j];
			
			}
		}
		System.out.println("Sum of matrices :");
		for(i=0;i<r;i++)
		{	for(j=0;j<c;j++)
			{	System.out.print(s[i][j]+"\t");
			
			}System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
