package practice;

public class missing_number_inArray {
	public static void findMissing(int arr[], int N)
    {
        int i;
        int temp[] = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }
 
        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }
 
        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println(ans);
    }
	public static void main(String[] args) {
//		//Time Complexity=O(n)
//		//space =O(1)
//		int arr[]= {1,2,4,5,7,6,8};
//		int n=arr.length+1;
//		int Total_sum=n*(n+1)/2; //sum of n sequential numbers 
//		int sum=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			sum=sum+arr[i];
//		}	
//		int missingNo=Total_sum-sum;
//		System.out.println(missingNo);
		int arr[] = { 6,1,2,8,3,4,7,10,5 };
        int n = arr.length;
 
        // Function call
        findMissing(arr, n);
		
	}
}
