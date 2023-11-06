package patterns;
/*
   * 
  * * 
 * * * 
* * * * 
*/
public class pyramid_star {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int k=3;k>=i;k--) //space
			{
				System.out.print(" ");
			}
			//for column
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
