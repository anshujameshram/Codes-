package hakerearth;

import java.util.Scanner;

public class find_product {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int answer=1;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int  i=0;i<n;i++)
		{
			answer=(answer*a[i])%(1000000007);
		}
		System.out.println(answer);
		
	}

}
