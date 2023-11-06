package practice;

public class MoveAllNegativeToOneSide {
	static void shiftIntegers(int arr[],int n)
	{
		
		int arr1[]=new int[n];
		int j=0;
		/*for(int i=0;i<n;i++)
		{
			if(arr[i]>=0)
			{
				arr1[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
			{
				arr1[j++]=arr[i];
			}
		}
		
		*/
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
			{
				arr1[j++]=arr[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]>=0)
			{
				arr1[j]=arr[i];
				j++;
			}
		}
		for( int i=0;i<n;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		
		int arr[]=new int[] {2,4,-10,13,-7,-60,52,8,-19};
		shiftIntegers(arr,arr.length);
	}

}

/*
 * class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int temp[]=new int[n];int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
                temp[j++]=arr[i];
            
            
        }
        if (j == n || j == 0)
            return;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
                temp[j++]=arr[i];
        }
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=temp[i];
        }
    }
}
 * 
 * 
 * 
 * 
 * *
 */