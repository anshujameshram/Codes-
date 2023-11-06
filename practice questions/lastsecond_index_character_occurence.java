package practice;

import java.util.Scanner;

public class lastsecond_index_character_occurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.nextLine();

		System.out.println("Enter character:");
		char ch = sc.next().charAt(0);

		int count = 0;
		int index[] = new int[str.length()];

		char[] arr = str.toCharArray();
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				count++;
				index[j++] = i;
			}
		}
		if (count == 0) {
			System.out.println("Character is not present");
		}
		if (count == 1) {
			System.out.println("Character appears only 1 times");
		}
		//System.out.println(index.length);
		int value=0;
		if (count > 1) {
			for (int i = 0; i < j; i++) {

				//System.out.println(index[index.length-1]);
				value=index[j-2];
			}
			System.out.println(value);
		}
		
	}

}
