package hakerearth;

import java.util.Scanner;

public class special_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=0,copy=0;
		int num=0,sum=0;

		for (int i = 0; i < n; i++) {
			m = sc.nextInt();
			copy=m;
			while(copy>0)
			{
				num=copy%10;
				sum=sum+num;
				copy=copy/10;
				
			}
			if(sum%4==0)
			{
				System.out.println(m);
			}
		}
		
	}

}
