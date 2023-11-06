package hakerearth;

import java.util.Scanner;

public class seven_segment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int a = 0;
		System.out.println("Entre testcase");
		int testcase = sc.nextInt();
		int no = 0;
		int num=0;
		int count = 0;
		for (int i = 0; i < testcase; i++) {
			count=0;
			
			n = sc.nextInt();
			for (int j = 0; j <= n; j++) {
				a = n % 10;

				if (a == 0 || a == 6 || a == 9) {
					num=6;
					no = 6 / 2;
					count += num;
				} else if (a == 2 || a == 3 || a == 5) {
					num=5;
					no = 5 / 2;
					count += num;
				} else if (a == 1) {
					
					num=2;
					no = 2 / 2;
					count += num;
				} else if (a == 4) {
					num=4;
					no = 4 / 2;
					count += num;
				} else if (a == 7) {
					num=3;
					no = 3 / 2;
					count += num;
				} else if (a == 8) {
					num=7;
					no = 7 / 2;
					count += num;
				}
				if (n <= 9) {
					for (int k = 1; k <= no; k++) {

						System.out.print("1");

					}

				} else {
					break;
				}
				n = n / 10;
			


			}
			
			System.out.println();
			if(count%2==0)
			{
			for (int k = 1; k <= count; k++) {

				System.out.print("1");

			}
			}
			else
			{
				System.out.println("7");
			}

		}
		


	}

}
