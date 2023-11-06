import java.util.Scanner;

public class maximun_sub_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] a1 = new int[n];
		int[] a2 = new int[n];
		int sum1[] = new int[n];
		int sum2[] = new int[n];
		int n1 = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {

//			if (a[i] > 0) {
//				if (a[i] < 0) {
//					break;
//				}
//				a1[i] = a[i];
//				sum1[i] = sum1[i] + a1[i];

//			} else {
//				if (a[i] < 0) {
//					n1=i;
//				}
//				a2[i] = a[i];
//				sum2[i] = sum2[i] + a2[i];
//
//			}
//
//		}
//		for (int i = 0; i <= ; i++) {
//			if (sum1[i] > sum2[i]) {
//				System.out.print(a[i] + " ");
//			}
//		}
//	------------------------------------------------------
//			if (a[i] < 0) {
//				n1 = i;
//			}
//			}
//			for (int j = 0; j < n1; j++) {
//				a1[i] = a[j];
//			}
//			for (int k = n1; k <n; k++) {
//				a2[i] = a[k];
//			}
//
//		}
//		for(int i=0;i<n1;i++)
//		{
//			System.out.println(a1[i]);
//		}
//		for(int i=n1;i<n;i++)
//		{
//			System.out.println(a2[i]);
//		}
//	
		}}}
