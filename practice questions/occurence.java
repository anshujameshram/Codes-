package practice;
//frequency(occurence) of number in array

import java.util.Scanner;

public class occurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of n:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter number to count occurence of that number:");
		int occ_no=sc.nextInt();
		int c=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==occ_no)
				c++;
		}
		System.out.println("The number occured "+c+" times");

	}

}
