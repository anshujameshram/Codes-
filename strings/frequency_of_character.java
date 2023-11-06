package strings;

import java.util.Scanner;

public class frequency_of_character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.nextLine();

		int freq[] = new int[s.length()];
		char arr[] = s.toCharArray();
		int count;

		for (int i = 0; i < s.length(); i++) 
		{
			freq[i] = 1;
			for (int j = i + 1; j < s.length(); j++) 
			{
				if (arr[i] == arr[j]) 
				{
					freq[i]++;
					arr[j] = '0';
				}
			}
		}
		for (int i = 0; i < freq.length; i++) 
		{
			if (arr[i] != ' ' && arr[i] != '0') 
			{
				System.out.println(arr[i] + " - " + freq[i]);
			}
		}
	}
}
