package practice;

import java.util.Scanner;

public class cyclically_rotate_by_1array {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the required size of the array ::");
	      int size = sc.nextInt();
	      int [] myArray = new int[size];
	      System.out.println("Enter elements of the array");
	      for(int i=0; i< size; i++){
	         myArray[i] = sc.nextInt();
	      }
	      int temp=myArray[size-1];
	      for(int i=size-1;i>0;i--)
	      {
	    	  myArray[i]=myArray[i-1];
	      }
	      myArray[0]=temp;
	      
	      for(int i=0;i<size;i++)
	      {
	    	  System.out.print(myArray[i]+" ");
	      }
	}
}
