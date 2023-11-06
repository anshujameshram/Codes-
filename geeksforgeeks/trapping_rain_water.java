//import java.util.Scanner;
//
//public class trapping_rain_water {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter size of n :");
//		int n = sc.nextInt();
//		int[] a1 = new int[n];
//		System.out.println("Enter elements of a1:");
//		for (int i = 0; i < n; i++) {
//			a1[i] = sc.nextInt();
//		}
//		int c=0;
//		for(int i=0;i<a1.length;i++)
//		{
//			
//				if( a1[i]>a1[0])
//					a1[i]=a1[0];
//			
//		}
//		int a=a1[0]*(a1.length);
//		for(int i=0;i<a1.length;i++)
//		{
//			c=c+a1[i];
//		}
//		System.out.println((a-c));
//		
//
//	}
//
//}

import java.util.Scanner;

public class trapping_rain_water {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		int p = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int len = a[0];
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < n; j++) {
				if (a[j] >= len) {
					continue;
				} else {
					p += len - a[j];
				}
			}
// break;
		}
		System.out.println(+p);
	}

}