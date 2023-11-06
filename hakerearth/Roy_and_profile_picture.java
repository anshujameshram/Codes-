package hakerearth;

import java.util.Scanner;

public class Roy_and_profile_picture {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L=sc.nextInt();
		int N=sc.nextInt();
		int W=0,H=0;
		for(int i=0;i<N;i++)
		{
		 W=sc.nextInt();
		 H=sc.nextInt();
		 if(W<L || H<L)
			{
				System.out.println("UPLOAD ANOTHER");
			}
			else if(W==H && W>=L && H>=L)
			{
				System.out.println("ACCEPTED");
			}
			else if(W!=H && W>=L && H>=L)
			{
				System.out.println("CROP IT");
			}
		}
		
		
		
	}

}
