package hakerearth;

import java.util.Scanner;

public class toogle_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] str1=str.toCharArray();

        for(int i=0;i<str.length();i++)
        {
            if(str1[i]>=65 && str1[i]<=90)
            {
                str1[i]=(char)(str1[i]+32);
            }
            else
            {
                str1[i]= (char)(str1[i]-32);
            }
        }
        for(int i=0;i<str1.length;i++)
        {
            System.out.print(str1[i]);
        }
	}

}
