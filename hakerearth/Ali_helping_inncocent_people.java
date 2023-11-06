package hakerearth;

import java.util.Scanner;

public class Ali_helping_inncocent_people {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        //System.out.println("Enter he string");
        String s = sc.next();
        int flag = 0;
        char a[] = s.toCharArray();

        for (int i = 0; i < s.length() - 1; i++) {
            // 123X45-98
            // 246A642-82
            if (Character.isDigit(a[i]) && Character.isDigit(a[i + 1])) {
                if ((a[i] + a[i + 1]) % 2 == 0) {
                    flag = 1;
                } else {
                    flag = 0;
                    break;
                }

            }

            if (flag == 1 && Character.isLetter(a[i])) {
            //  System.out.println(+'A');
                if (a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U' || a[i] == 'Y') {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                    
                }

            }

        }

        if (flag == 1) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

	}

}
