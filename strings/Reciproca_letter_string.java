package strings;

public class Reciproca_letter_string {
	public static void Reciprcalstring(String s) {
		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (Character.isLetter(ch)) {
				if (Character.isLowerCase(ch)) {
					ch = (char) (122 - (int) ch + 97);
				} else if (Character.isUpperCase(ch)) {
					ch = (char) (90 - (int) ch + 65);
				}
			}
			System.out.print(ch + " ");
		}

	}

	public static void main(String[] args) {
		String s = "Geeks for Geeks";
		System.out.print("The reciprocal of " + s + " is - " + "\n");

		// calling the function
		Reciprcalstring(s);

	}

}
