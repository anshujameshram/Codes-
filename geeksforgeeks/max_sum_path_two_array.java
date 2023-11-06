import java.util.Scanner;

public class max_sum_path_two_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of n and m:");
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] a1 = new int[n];
		int[] a2 = new int[m];

		System.out.println("Enter elements of a1:");
		for (int i = 0; i < n; i++) {
			a1[i] = sc.nextInt();
		}
		System.out.println("Enter elements of a2:");
		for (int i = 0; i < m; i++) {
			a2[i] = sc.nextInt();
		}

		// find common elements
		int co_ele = 0, index = 0, index1 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a1[i] == a2[j]) {
					co_ele = a1[i];
					index1 = i;
					index = j;
					break;
				}
			}
		}
		
		int sum1 = 0, sum2 = 0;
		if (n > m) {
			for (int i = index + 1; i < n; i++) {
				sum2 = sum2 + a1[i];
			}
			for (int i = 0; i <= index1; i++) {
				sum1 = sum1 + a2[i];
			}
		} else if (n <= m) {
			for (int i = 0; i <= index1; i++) {
				sum1 = sum1 + a1[i];
			}
			for (int i = index + 1; i < m; i++) {
				sum2 = sum2 + a2[i];
			}
		}
		
		System.out.println(sum1 + sum2);

	}

}
