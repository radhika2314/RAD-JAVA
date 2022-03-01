package main;
import java.util.*;

public class FloatingPoint {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter Number 1:  ");
		float a = in.nextFloat();
		System.out.println("Enter Number 2:  ");
		float b = in.nextFloat();
		if(Math.ceil(Math.abs(a-b))<0.01)
		{ System.out.println("They are the same");
		
		}
		else
		{ System.out.println("They are not the same");
		
		}
		// TODO Auto-generated method stub

	}

}
