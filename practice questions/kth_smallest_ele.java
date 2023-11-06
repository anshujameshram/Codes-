package practice;

import java.util.Scanner;

/*
 N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7.
 */
public class kth_smallest_ele {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("enter value of k for kth smallest element:");
		int k=sc.nextInt();
		int temp;
		System.out.println("enter elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("\nkth smallest element="+arr[k-1]);
	}

}
