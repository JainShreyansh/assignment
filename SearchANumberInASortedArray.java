package test;

import java.io.IOException;
import java.util.Scanner;

public class SearchANumberInASortedArray {
	public static void main(String[] args) throws IOException {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Array Length:");
		int n = reader.nextInt();
		System.out.println(n);
		int[] a = new int[n];
		System.out.println("Enter " + n + " numbers:");
		for (int i = 0; i < n; i++)
			a[i] = reader.nextInt();
		System.out.println("Enter a number to search in array:");
		int x = reader.nextInt();
		if(isSorted(a))
		{
			if(isPresent(a, x))
			{
				System.out.println("Number "+x+" is present in the list.");
			}
			else
			{
				System.out.println("Number "+x+" is not present in the list.");
			}
		}
		else
		{
			System.out.println("Array is not sorted!");
		}
			reader.close();
	}

	public static boolean isSorted(int[] a) {
		for (int i = 0; i < (a.length) - 1; i++) {
			if (a[i] > a[i + 1])
				return false;
		}
		return true;
	}

	public static boolean isPresent(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if (x == a[i])
				return true;
		}
		return false;
	}
}
