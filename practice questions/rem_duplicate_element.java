package practice;

import java.util.Arrays;
import java.util.Scanner;

public class rem_duplicate_element {
	public static int removeDuplicateElements(int arr[],int n)
	{
		int temp[]=new int[n];
		int j=0;
		if(n==0||n==1)
			return n;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
				temp[j++]=arr[i];
		}
		temp[j++]=arr[n-1];
		
		for(int i=0;i<j;i++)
		{
			arr[i]=temp[i];
		}
		return j;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		int length=arr.length;
		for(int i=0;i<length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		length=removeDuplicateElements(arr,length);
		for(int i=0;i<length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
