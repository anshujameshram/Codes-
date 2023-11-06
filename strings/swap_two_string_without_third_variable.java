package strings;

import java.util.Scanner;

public class swap_two_string_without_third_variable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string1:");
		String str1=sc.next();    //abcde //5
		
		System.out.println("Enter string2:");
		String str2=sc.next();     //defgh  //5
		
		//swapping without using third variable
		str1=str1+str2;    //abcdedefgh
		str2=str1.substring(0,(str1.length()-str2.length()));  //extract from updated string
		str1=str1.substring(str2.length());    //
		
		System.out.println("String1:"+str1);
		System.out.println("String2:"+str2);
		

	}

}
