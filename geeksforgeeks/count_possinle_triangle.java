import java.util.Arrays;
import java.util.Scanner;
//Given an unsorted array arr[] of n positive integers. 
//Find the number of triangles that can be formed with three different array elements 
//as lengths of three sides of triangles. 
//
//Example 1:
//
//Input: 
//n = 3
//arr[] = {3, 5, 4}
//Output: 
//1
//Explanation: 
//A triangle is possible 
//with all the elements 5, 3 and 4.
//Example 2:
//
//Input: 
//n = 5
//arr[] = {6, 4, 9, 7, 8}
//Output: 
//10
//Explanation: 
//There are 10 triangles
//possible  with the given elements like
//(6,4,9), (6,7,8),...
public class count_possinle_triangle {
	public static int countTriangle(int[] arr,int n) {
		Arrays.sort(arr);
		int count = 0;
		for (int i = arr.length - 1; i >= 2; i--) {
			int l = 0;
			int r = i - 1;

			while (l < r) {
				if (arr[l] + arr[r] > arr[i]) {
					count += (r - l);
					r--;
				} else {
					l++;
				}
			}

		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(countTriangle(arr,n));
	}

}
