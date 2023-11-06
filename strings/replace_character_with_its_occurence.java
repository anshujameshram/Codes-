package strings;

import java.util.Scanner;

//string: opentext
//'t' occurs 2 times
// replace t with its occurence
// string should become -- open1ex2

public class replace_character_with_its_occurence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String s=sc.nextLine();
		
		System.out.println("Enter character to replace:");
		char ch=sc.next().charAt(0);
		
		char[] a=s.toCharArray();
		int cnt=1;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ch) {
				a[i]= String.valueOf(cnt).charAt(0);
				cnt++;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		

	}

}
