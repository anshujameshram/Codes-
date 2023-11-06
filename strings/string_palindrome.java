package strings;

import java.util.Scanner;

public class string_palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.next();
		boolean flag=true;
		char arr[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++ )
		{
			if(arr[i]!= arr[str.length()-i-1])
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");

	}

}
