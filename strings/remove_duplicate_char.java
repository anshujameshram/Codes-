package strings;

import java.util.Scanner;

public class remove_duplicate_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.nextLine();

		int count ;
		char string[] = s.toCharArray();
		for (int i = 0; i < string.length; i++) {
			count=1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
				} 
			}
			if(count==1)
			{
				System.out.print(string[i]+" ");
			}
		}

	}

}
