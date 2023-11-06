package strings;

import java.util.Scanner;

public class duplicate_characters_from_string {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		
		String str1=sc.nextLine();
		
		int count;
		char string[]=str1.toCharArray();
		
		System.out.println("Duplicate characters in a given string:");
		for(int i=0;i<string.length;i++)
		{
			count=1;
			for(int j=i+1;j<string.length;j++)
			{
				if(string[i]==string[j]&&string[i]!=' ')
				{
					count++;
					//Set string[j] to 0 to avoid printing visited character 
					string[j]='0';
					
				}
			}
			if(count>1 && string[i]!='0')
			{
				System.out.println(string[i]);
			}
		}
		*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String s=sc.nextLine();
		
		int count;
		char string[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(string[i]==string[j] && string[i]!=' ')
				{
					count++;
					string[j]='0';
				}
			}
			if(count>1 && string[i]!='0')
			{
				System.out.println(string[i]);
			}
		}
	}
}
