package practice;

import java.util.Scanner;

public class non_repeating_elements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n:");
		boolean chk;
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			chk=false;
			for(int j=0;j<n;j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					chk=true;
					break;
				}
			}
			if(chk==false)
				System.out.println(arr[i]+" ");
		}
		
	}

}
