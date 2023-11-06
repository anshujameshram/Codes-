package practice;
//all 0's at left side and 1's on right side
public class seggregateZeroAndOnes {

	public static void main(String[] args) {
		int arr[]= {0,1,0,1,0,1};
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr[j]=arr[i];
				j++;
			}
			
		}
		while(j<arr.length)
		{
			arr[j]=1;
			j++;
			
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}

}
