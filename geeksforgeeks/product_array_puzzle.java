import java.util.Scanner;

public class product_array_puzzle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of n :");
		int n = sc.nextInt();
		int[] a1 = new int[n];
		System.out.println("Enter elements of a1:");
		for (int i = 0; i < n; i++) {
			a1[i] = sc.nextInt();
		}
		int prod = 0;
		for (int i = 0; i < n; i++) {
			prod = 1;
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				else {
					prod = prod * a1[j];
				}
			}
			System.out.println(prod);
		}

	}

}
