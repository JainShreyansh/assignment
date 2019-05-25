package test;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = reader.nextLine();
		
		if(palinCheck(str))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not a Palindrome");
		}
		reader.close();
	}
	public static Boolean palinCheck(String str)
	{
		int i,j;
		for(i=0,j=str.length()-1;i<str.length()/2;i++,j--)
		{
			if(str.charAt(i) != str.charAt(j))
				return false;
		}
		return true;
	}

}
