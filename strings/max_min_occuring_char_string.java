package strings;

import java.util.Scanner;

public class max_min_occuring_char_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		int freq[]=new int[str.length()];
		
		char[] arr=str.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			freq[i]=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] &&arr[i]!=' '&&arr[i]!='0')
				{
					freq[i]=freq[i]+1;
					arr[j]='0';
				}
			}
		}
		int min=freq[0];
		int max=freq[0];
		char maxChar=str.charAt(0);
		char minChar=str.charAt(0);
		
		for(int i=0;i<freq.length;i++)
		{
			if(min>freq[i]&&freq[i]!='0')
			{
				min=freq[i];
				minChar=arr[i];
			}
			if(max<freq[i] && freq[i]!='0')
			{
				max=freq[i];
				maxChar=arr[i];
			}
		}
		System.out.println("Min char="+minChar);
		System.out.println("Max char="+maxChar);
		
		
	}

}
