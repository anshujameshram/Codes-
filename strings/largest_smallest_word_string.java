package strings;

import java.util.Scanner;

public class largest_smallest_word_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.nextLine();
		
		String words[]=str.split(" ");
		int count;
		String small=words[0];
		String large=words[0];
		for(int i=0;i<words.length;i++)
		{
			count=1;
			for(int j=i+1;j<words.length;j++)
			{
				if(small.length()>words[j].length())
				{
					small=words[i];
				}
				else if(large.length()<words[j].length())
				{
					large=words[i];
				}
			}
		}
		System.out.println("Smallest string:"+small);
		System.out.println("largest string:"+large);
		
		
		
		/*str=str+" ";
		String word="",lg="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch !=' ')
			{
				word=word+ch;
			}
			else
			{
				if(word.length()>lg.length())
				{
					lg=word;
				}
				word="";
			}
		}
		System.out.println("Longest word:"+lg);*/
		
		
		

	}

}
