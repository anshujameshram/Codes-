package practice;

import java.util.Scanner;

/*
 Two sum problem
 given an array of integers return indices of two numbers such that
 they add up to a specific target
 
 ex-
 nums=[2,7,11,15]
 target=18
 nums[1] +nums[2]=7+11=18
 return [1,2]
 
 */
public class twoSumProblem {
		static int[] twoSumProblem(int []arr,int target)
		{
			int l=0,r=0;
			for(int i=0 ; i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]+arr[j]==target)
					{
						l=i;
						r=j;
					}
				
				}
			}
			return new int[] {l,r};
			
		}
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
		System.out.println("Enter target:");
		int target=sc.nextInt();
		
		int[] a=twoSumProblem(arr, target);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}

}
