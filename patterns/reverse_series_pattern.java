package patterns;

import java.util.Scanner;

public class reverse_series_pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of row:");
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
	}

}
