package practice;

import java.util.Scanner;

public class longest_consecutive_subsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array:");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter elements:");
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int temp=0;
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
		int x = arr[0];
		int count = 0, y = 0;
		
		for (int i = 0; i < n; i++) {
			if (arr[i] == (x + y))
			{
				count++;
				y++;
			}
		}
		System.out.println(count);
	}

}
