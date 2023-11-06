import java.util.Arrays;
import java.util.Scanner;

public class wave_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		int[] a = new int[n];
		int temp = 0;
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);//sort
		for (int i = 0; i < (n-1); i += 2) {

			temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
