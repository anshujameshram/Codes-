package patterns;

import java.util.Scanner;

public class right_down_mirror_pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of row:");
		int row=sc.nextInt();
		
		for(int i=0;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=row-i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
