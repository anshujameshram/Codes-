package practice;

import java.util.Scanner;

/*
     the array may contain multiple peak elements, in that case return any one
     peak element.
     
     peak element- an element which is greater than its neighbour
     
     ex-1
     i/p- {2,3,4,7,5}
     o/p- 7
     
     i/p- {8,7,6,5,4}
     o/p- 8
     
     An array is strictly decreasing , so in that case first element is 
     the peak element.
     
     i/p-{2,3,4,5,6}
     o/p-6
     
     AN array is strictly increasing so in that case last element is peak element.
     
     i/p-{2,2,2,2,2}
     o/p-2
     
     in that case every element is a peak element so return the index of any element.
 */

public class peak_element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		if (arr[0] > arr[1])
			System.out.println(arr[0]);
		if (arr[size - 1] >= arr[size - 2])
			System.out.println(arr[size - 1]);
		for (int i = 1; i < size - 1; i++) {

			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				System.out.println(arr[i]);
				break; // for any one peak element otherwise we can remove it.
			}

		}

	}

}
