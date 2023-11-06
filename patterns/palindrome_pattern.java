package patterns;

import java.util.Scanner;

public class palindrome_pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of row:");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=row-i;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=2*i-1;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=2*i-2;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
