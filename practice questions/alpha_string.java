package practice;
//Enter no of string:
//5

//Enter strings:
//Anshu
//pratiksha
//jaya
//baby
//chakuli

//o/p-
//Anshu
//jaya
//baby
//chakuli
//pratiksha

import java.util.Scanner;

public class alpha_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of string:");
		int n = sc.nextInt();

		String arr[] = new String[n];
		System.out.println("Enter strings:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();

		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				String temp;
				if ((arr[i].compareTo(arr[j])) > 0) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
