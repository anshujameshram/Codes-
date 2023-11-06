package hakerearth;

import java.util.Scanner;

public class palindrome_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.next().toLowerCase();
        char[] arr=str.toCharArray();
        char[] arr1= {};

        for(int i=str.length();i>=0;i--)
        {
            arr1[i]=arr[i];
        }

        if(arr.equals(arr1))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
	}

}
