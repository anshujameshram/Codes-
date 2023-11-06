package patterns;
//o/p-
//Enter value of row:
//8
//* * * * * * * * 
// * * * * * * * 
//  * * * * * * 
//   * * * * * 
//    * * * * 
//     * * * 
//      * * 
//       * 
import java.util.Scanner;

public class reverse_pyramid_pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of row:");
		int row=sc.nextInt();
		/*for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}*/
		
		for(int i=0;i<=row; i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=row-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
