package test;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = reader.nextLine();
		if(str.equals(reverse(str)))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not a Palindrome");
		}
		reader.close();
	}
	public static String reverse(String s)
	{
		String r = "";
		for(int i=s.length()-1;i>=0;i--)
			r = r+s.charAt(i);
		return r;
	}

}
