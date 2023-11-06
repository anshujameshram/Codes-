import java.util.Scanner;

/*
 * 
 *       1
 *     2 1 2
 *   3 2 1 2 3
 * 4 3 2 1 2 3 4
 *   3 2 1 2 3
 *     2 1 2
 *       1      
 * 
 * */
public class reverse_palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of row:");
		int row=sc.nextInt();
		
		for(int i=0;i<=row;i++)
		{
			for(int j=row-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=row-1;i>=0;i--)
		{
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
