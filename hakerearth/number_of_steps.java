package hakerearth;

import java.util.Scanner;

public class number_of_steps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the size of array:");
		int n = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[n];

		// System.out.println("Enter the elements of array1:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		// System.out.println("Enter the elements of array2:");
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}

		int min = a[0];
		int max = a[0];
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		for (int i = 1; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		for (int i = 0; i < max; i++) { // 5 7 20 5 15 2 2 1 3 5
			for (int j = 0; j < n; j++) {
				if (a[j] > min && a[j] != min && a[j] >= b[j]) {
					a[j] = a[j] - b[j];
					count++;

				}

			}
			for (int j = 0; j < n; j++) {
				if (a[j] < min) {
					min = a[j];
					j = 0;
				}

			}

		}

		for (int i = 0; i < n; i++) {
			if (a[i] != min) {
				count = -1;
				System.out.println(count);
				return;
			}
		}
		System.out.println(+count);

	}

}