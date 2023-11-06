package strings;

import java.util.Scanner;

public class checkStringLowerCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		char[] s = sc.next().toCharArray();
		int flag=0;
		for(int i=0;i<s.length-1;i++)
		{
			if(Character.isLowerCase(s[i]))
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
		

	}

}
