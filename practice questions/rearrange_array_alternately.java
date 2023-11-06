package practice;

import java.util.Arrays;
import java.util.Scanner;

public class rearrange_array_alternately {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int small=0,large=n-1;
		boolean flag=true;
		int temp[] = arr.clone();
		for(int i=0;i<n;i++)
		{
			if(flag)
			{
				arr[i]=temp[large];
				large--;
			}
			else
			{
				arr[i]=temp[small];
				small++;
				
			}
			flag=!flag;
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
}
