package strings;

import java.util.Scanner;
public class reverse_each_word_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.nextLine();
		String[] s_split = s.split(" ");
		String output = "";
		for (String word : s_split) {
			String reserved_word = "";
			for (int i = word.length() - 1; i >= 0; i--) 
			{
				reserved_word = reserved_word + word.charAt(i);
			}
			output = output + reserved_word + " ";
		}
		System.out.print(output + " ");
	}
}
