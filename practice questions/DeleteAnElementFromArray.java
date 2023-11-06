package practice;

import java.util.Scanner;

public class DeleteAnElementFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n ;
		System.out.println("enter value of n:");
		n=sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter elements=");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter position of an element to be deleted");
		int del = sc.nextInt();

		if ( del < 0 && del > n) {
			System.out.println("Invalid position");
		} else {
			for (int i = del - 1; i < n-1; i++) {
				arr[i] = arr[i + 1];
			}
			n--;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
