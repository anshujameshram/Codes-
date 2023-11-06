package strings;

import java.util.Scanner;

public class ReverseStringAfterFirstLetterCapital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		char[] s = sc.next().toCharArray();
		
		String reversed="";
		for(int i=s.length-1;i>=0;i--)
		{
			reversed=reversed+s[i];
		}
		System.out.println(reversed);
		char[] c=reversed.toCharArray();
		System.out.println(Character.toUpperCase(c[1]));
		
		

	}

}
