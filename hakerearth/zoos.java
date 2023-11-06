package hakerearth;

import java.util.Scanner;

public class zoos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		
		char[] arr = str.toCharArray();
		int countz = 0;
		int counto = 0;
		for (int i = 0; i < arr.length; i++) {
			if (str.charAt(i) == 'z') {

				countz ++;;

			}
			if (str.charAt(i) == 'o') {
				counto ++;
			}
		}
		
		if(counto==(2*countz))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
