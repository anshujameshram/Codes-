package strings;

import java.util.Scanner;

public class remove_whitespaces_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.nextLine();
		
		/*String str=s.replaceAll("\\s", "");
		System.out.print(str);*/
		char[] a=s.toCharArray();
		String resultstr="";
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=65 && a[i]<=90 || a[i]>=97 && a[i]<=122)
			{
				resultstr=resultstr+a[i];
			}
		}
		System.out.print(resultstr);

	}

}
