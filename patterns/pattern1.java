/*

 * * * * *
 * * * *
 * * *
 * *
 * 
 
 */

package patterns;

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of row:");
		int row=sc.nextInt();
		//System.out.println("Enter value of k:");
		int k=row*(row+1)/2;
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}
		
		/*
		 * * * * *
		   * * * *
		     * * *
		       * *
		         *
		  
		  */
		/*int i,j;
		for( i=5;i>=1;i--)
		{
			for(j=5;j>i;j--)
			{
				System.out.print("  ");
			}
			
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/

	}

}
