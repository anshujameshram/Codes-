package practice;

public class PairsInArrayWithGivenSum {
	public static void main(String[] args) {
		int arr[] = { 1,5,7,1};
		int sum = 9;
		// output- {2,7} {}
		int low = 0, high = arr.length - 1;
		int count=0;
		while (low < high) {
			if (arr[low] + arr[high] > sum) {
				high--;
			} else if (arr[low] + arr[high] < sum) {
				low++;
			} else if (arr[low] + arr[high] == sum) {
				//System.out.println("Pair (" + arr[low] + "," + arr[high] + ")");
				count++;
				
				low++;
				high--;
			}
		}
		System.out.println(count);
	}
}
