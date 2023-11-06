package hakerearth;

import java.util.*;

public class Maximum_borders {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int rows = 0, column = 0, count = 0;

		for (int i = 0; i < cases; i++) {
			rows = sc.nextInt();
			column = sc.nextInt();
			int a[] = new int[rows];
			String s[] = new String[rows];
			for (int j = 0; j < rows; j++) {
				count = 0;
				s[j] = sc.next();
				for (int k = 0; k < column; k++) {
					if (s[j].charAt(k) == '#') {
						count++;
					}
				}
				a[j] = count;
			}
			Arrays.sort(a);
			int p = a.length - 1;
			System.out.println(a[p]);

		}

	}

}
