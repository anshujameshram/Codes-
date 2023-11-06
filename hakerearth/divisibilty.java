package hakerearth;

/*import java.util.Scanner;

public class divisibilty {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();
        
        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextInt();
        }

        
        // Write your code here
        // ans = 
        int last_digit;
        int num[]=new int[N];
        for(int i=0;i<N;i++)
        {
            last_digit=data[i]%10;
            num[i]=last_digit;
        }
        int number=0;
       
        for(int n:num)
        {
        	
        	number=number*10+n;
        	
        }
        System.out.println(number);
        
        if(number%10==0 || number==0)
        {
        	System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
	}

}
*/

import java.util.*;

class divisibilty {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();
        
        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextInt();
        }

        
        // Write your code here
        // ans = 
        int last_digit;
        int num[]=new int[N];
        for(int i=0;i<N;i++)
        {
            last_digit=data[i]%10;
            num[i]=last_digit;
        }
        /*int number=0;
       
        for(int n:num)
        {
        	number=number*10+n;
        }
        //System.out.println(number);*/
        int number=num[N-1]%10;
        
        if(number%10==0 || number==0)
        {
        	System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }       
    }
}