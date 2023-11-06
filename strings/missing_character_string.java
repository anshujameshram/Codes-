package strings;

import java.util.Scanner;

public class missing_character_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.nextLine().toLowerCase();

		char[] a = s.toCharArray();
		char s1 = a[0];

		char first = a[0];
		char last = 0;
		for (int i = 1; i <= a.length; i++) {
			if (++first != a[i]) {
				last = a[i];
				break;

			}
		}

		for (char i = first; i < last; i++) {
			System.out.print((char) i + " ");
		}

//		for (int i = 0; i < a.length; i++) {
//			// char c1 = a[i]++;
//			for (int j = i + 1; j; j++) {
//				if (a[i] >= 97 && a[i] <= 122) {
//
//					if (a[i] == a[j]) {
//						continue;
//
//					} else {
//						s1 = a[i];
//						
//					}
//				}
//			}
//		}
//		System.out.println(s1);

	}

}
