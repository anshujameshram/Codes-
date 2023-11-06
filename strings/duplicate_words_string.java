package strings;

import java.util.Scanner;

public class duplicate_words_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.nextLine().toLowerCase();
		int count;
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			count=1;
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					count++;
					s1[j]="0";
				}
			}
			if(count>1 && s1[i]!="0")
			{
				System.out.println(s1[i]);
			}
		}
		
	}

}
