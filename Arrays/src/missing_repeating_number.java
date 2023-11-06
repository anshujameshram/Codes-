import java.util.Scanner;

public class missing_repeating_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// repeating elements
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.print(arr[i]+" ");
				break;
			}
		}

		// missing number
		for (int i = 1; i < n; i++) {
			if (i != arr[i - 1]) {
				System.out.print(i+" ");
			}
		}
	}

}
