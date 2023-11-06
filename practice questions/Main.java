package practice;

/* Save this in a file called Main.java to compile and test it */
/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class Main {
    public static int processArray(ArrayList<Integer> array) {
        /* 
         * Modify this function to process `array` as indicated
         * in the question. At the end, return the appropriate
         * value.
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method
         *
         * Submit this entire program (not just this function)
         * as your answer
         */
        int count=0,sum=0;
        for(int i=0;i<array.size();i++)
        {
            
            while(array.get(i).SIZE==2)
            {
                sum=sum+array.get(i);
                if(array.get(i+1).SIZE==3)
                {
                    return 1;
                }
                count++;
            }
            if(sum>=75)
                return count;
        }
        return 1;
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0) 
                break;
            arrayList.add(new Integer(num));
        }
        int result = processArray(arrayList);
        System.out.println(result);
    }
}

