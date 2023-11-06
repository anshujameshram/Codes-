package practice;
/*
 arr1={1,5,6,7}
 arr2={2,5,8,9,11}
 merging two array in sorted order
  */
public class mergeTwoArraySortedOrder {
	public static int[] merge(int[] arr1,int[] arr2)
	{
		int len1=arr1.length;
		int len2=arr2.length;
		
		int i=0,j=0,k=0;
		int result[]=new int[len1+len2];
		
		while(i<len1 && j<len2)
		{
			if(arr1[i] < arr2[j])
			{
				result[k]=arr1[i];
				i++;
				k++;
			}else {
				result[k]=arr2[j];
				j++;
				k++;
			}		
		}
		while(i<len1)
		{
			result[k]=arr1[i];
			i++;
			k++;
		}
		while(j<len2)
		{
			result[k]=arr2[j];
			j++;
			k++;
		}
		return result;
	}
	public static void main(String[] args) {
		int arr1[]= {1,5,6,7};
		int arr2[]= {2,5,8,9,11};
		
		int a[]=merge(arr1,arr2);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
