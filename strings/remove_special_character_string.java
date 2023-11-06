package strings;

import java.util.Scanner;

public class remove_special_character_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.nextLine();
		
		char[] arr=s.toCharArray();
		String resultstr="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=65&& arr[i]<=90 || arr[i]>=97 && arr[i]<=122)
			{
				resultstr=resultstr+arr[i];
			}
		}
		System.out.print(resultstr);
	}

}
