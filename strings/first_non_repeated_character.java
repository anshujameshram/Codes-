package strings;

import java.util.Scanner;

//first non repeated characters
public class first_non_repeated_character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.nextLine();

		char[] arr = s.toCharArray();
		boolean unique;
		
		for(int i=0;i<arr.length;i++)
		{
			unique=true;
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					unique=false;
				}
			}
			if(unique==true)
			{
				System.out.println(arr[i]);
				break;
			}		
		}
	}
}
