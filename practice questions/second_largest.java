package practice;

import java.util.Scanner;

public class second_largest {
	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int largest=0;
		int second_Largest=0;
		
		for(int i=0;i<size;i++)
		{
			if(largest<arr[i])
			{
				largest=arr[i];
			}
		}
		for(int i=0;i<size;i++)
		{
			if(second_Largest<arr[i] && arr[i]!=largest)
			{
				second_Largest=arr[i];
			}
		}
		System.out.println("Second largest="+second_Largest);
	}
}
