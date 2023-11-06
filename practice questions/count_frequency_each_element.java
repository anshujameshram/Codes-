package practice;
/*Algorithm
1.Declare and initialize an array arr.
2.Declare another array fr with the same size of array arr. 
It is used to store the frequencies of elements present in the array.
3.Variable visited will be initialized with the value -1. 
It is required to mark an element visited that is, it helps us to avoid counting 
the same element again.
4.The frequency of an element can be counted using two loops.
 One loop will be used to select an element from an array, and another loop will be 
 used to compare the selected element with the rest of the array.
5.Initialize count to 1 in the first loop to maintain a count of each element. 
Increment its value by 1 if a duplicate element is found in the second loop. 
Since we have counted this element and didn't want to count it again. 
Mark this element as visited by setting fr[j] = visited. 
Store count of each element to fr.
6.Finally, print out the element along with its frequency.*/
import java.util.Scanner;

public class count_frequency_each_element {
	public static void main(String[] args) {
		int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
		int freq[]=new int[arr.length];
		int visited=-1;  //for number should not be repeated again
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					freq[j]=visited;//element is visited so don't want update it again
				}
			}
			if(freq[i]!=visited)
			{
				freq[i]=count;
			}
		}
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]!=visited)
			{
			System.out.println("Element  | frequency");
			System.out.println(arr[i]+" | "+freq[i]);
			}
		}
	}

}
