package main;
import java.util.*;

public class Replacestring {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter String");
		String a = in.nextLine();
		System.out.println("Enter replacement string");
		String b = in.nextLine();
		System.out.println("Enter string to replace");
		String r = in.nextLine();
		String new_str = a.replaceAll(r,b);		
	    System.out.println("New String: " + new_str);
		// TODO Auto-generated method stub

	}

}
